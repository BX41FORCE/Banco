/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.dao.impl;

/**
 *
 * @author bcortez
 */
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.EntityManager;

import banco.dao.BancoGenericDao;
import java.util.List;
import javax.persistence.PersistenceContext;

/**
 *
 * @author UDA
 *
 * @param <T> Objeto Generico.
 * @param <PK> Objeto Generico.
 *
 */
public class BancoGenericDaoImpl<T, PK extends Serializable> implements BancoGenericDao<T, PK> {

    @PersistenceContext(unitName = "BancoPU")
    private EntityManager em;

    public void setEntityManager(EntityManager entityManager) {
        this.em = entityManager;
    }

    public EntityManager getEntityManager() {
        return em;
    }

    private Class<T> classT; // cumple las veces de T.class que no es valido demomento en java.

    @SuppressWarnings({"unchecked", "rawtypes"})
    public BancoGenericDaoImpl() {

        // Bueno pues como no se puede hacer T.class hay que hacer esta
        // movida mediante introspección.
        // this.classT = (Class<T>) ((ParameterizedType) getClass()
        // .getGenericSuperclass()).getActualTypeArguments()[0];
        // para obtener la clase T. es decir el primer parámetro generico
        // mediante
        // introspección.
        // evitar un posible ClassCastException Por si acaso a su vez el tipo se
        // trata de un generico
        Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        if (type instanceof ParameterizedType) {
            this.classT = (Class) ((ParameterizedType) type).getRawType();
        } else {
            this.classT = (Class) type;
        }
    }

    @Override
    public T add(T entity) {

        this.em.persist(entity);
        return entity;
    }

    @Override
    public T find(PK id) {

        return (T) em.find(classT, id);
    }

    @Override
    public void remove(PK id) {

        T entity = (T) em.find(classT, id);
        em.remove(entity);

    }

    @Override
    public T update(T entity) {
        return em.merge(entity);

    }

//	@Transactional(readOnly = true)
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<T> findAll() {
//		return em.createQuery("Select t from " + this.classT.getSimpleName() + " t").getResultList();
//	}

    @Override
    public List<T> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
