/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.dao.impl;

import banco.dao.EmpleadosDao;
import banco.vo.Empleados;
import java.util.List;

/**
 *
 * @author bcortez
 */
public class EmpleadosGenericDaoImpl extends BancoGenericDaoImpl<Empleados, Integer> implements EmpleadosDao {

    @Override
    public void registrarEmpleado(Empleados persona) {
        this.registrarEmpleado(persona);
    }

    @Override
    public Empleados consultarEmpleado(int documento) {
        return this.consultarEmpleado(documento);
    }

    @Override
    public List<Empleados> listaDeEmpleados() {
        return this.listaDeEmpleados();
    }

}
