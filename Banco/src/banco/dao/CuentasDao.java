/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.dao;

import banco.vo.Cuentas;
import java.util.List;

/**
 *
 * @author bcortez
 */
public interface CuentasDao {

    public void registrarCuenta(Cuentas cliente);

    public Cuentas consultarCuenta(int documento);

    public List<Cuentas> listaDeCuentas();
}
