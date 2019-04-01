/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.dao;

import banco.vo.Empleados;
import java.util.List;

/**
 *
 * @author bcortez
 */
public interface EmpleadosDao {

    public void registrarEmpleado(Empleados persona);

    public Empleados consultarEmpleado(int documento);

    public List<Empleados> listaDeEmpleados();
}
