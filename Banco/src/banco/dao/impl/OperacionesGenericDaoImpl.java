/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.dao.impl;

import banco.dao.CuentasDao;
import banco.vo.Cuentas;
import java.util.List;

/**
 *
 * @author bcortez
 */
public class OperacionesGenericDaoImpl extends BancoGenericDaoImpl<Cuentas, Integer> implements CuentasDao {

    @Override
    public void registrarCuenta(Cuentas cliente) {
        this.registrarCuenta(cliente);
    }

    @Override
    public Cuentas consultarCuenta(int documento) {
        return this.consultarCuenta(documento);
    }

    @Override
    public List<Cuentas> listaDeCuentas() {
        return this.listaDeCuentas();
    }

}
