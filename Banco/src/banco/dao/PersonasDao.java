/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.dao;

import java.util.List;
import banco.vo.Personas;

/**
 *
 * @author bcortez
 */
public interface PersonasDao {

    public void registrarPersona(Personas persona);

    public Personas consultarPersona(int documento);

    public List<Personas> listaDePersonas();
}
