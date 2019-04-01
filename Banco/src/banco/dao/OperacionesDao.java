/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.dao;

import banco.vo.Operaciones;
import java.util.List;

/**
 *
 * @author bcortez
 */
public interface OperacionesDao {
    public void registrarOperacion(Operaciones persona);

    public Operaciones consultarOperacion(int documento);

    public List<Operaciones> listaDeOperaciones();
}
