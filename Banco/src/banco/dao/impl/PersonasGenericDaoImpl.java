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
import java.util.List;
import banco.dao.PersonasDao;
import banco.vo.Personas;

public class PersonasGenericDaoImpl extends BancoGenericDaoImpl<Personas, Integer> implements PersonasDao {

    @Override
    public void registrarPersona(Personas persona) {
        this.add(persona);
    }

    @Override
    public Personas consultarPersona(int documento) {
        return this.find(documento);
    }

    @Override
    public List<Personas> listaDePersonas() {
        return this.findAll();
    }
}
