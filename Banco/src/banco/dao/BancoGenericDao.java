package banco.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

/**
 * 
 * @author UDA
 *
 * @param <T> Objeto Generico.
 * @param <PK> Objeto Generico.
 * 
 */
public interface BancoGenericDao<T , PK extends Serializable> {
	
	void setEntityManager(EntityManager entityManager);
	
	EntityManager getEntityManager();
	
	/**
	 * Añadir un nuevo registro 
	 * @param entity instancia de clase entidad.
	 * @return el entity
	 */
	T add (T entity);
	
	/**
	 * Encontrar una entidad por clave primaria.
	 * @param id clave primaria 
	 * @return la  entidad o null en caso de no existir
	 */
	T find(PK id);
	
	/**
	 * Borrar un registro.
	 * @param id clave primaria  
	 */
	void remove(PK id);
	
	/**
	 * modificar un registro
	 * @param entity
	 * @return la entidad modificada
	 */
	T update(T entity);
	
//	/**
//	 * devolver el la lista completa de entidades
//	 * @return lista de entidades
//	 */
	List<T> findAll();
}