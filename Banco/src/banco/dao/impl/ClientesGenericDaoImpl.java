/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.dao.impl;

import banco.dao.ClientesDao;
import banco.vo.Clientes;
import java.util.List;

/**
 *
 * @author bcortez
 */
public class ClientesGenericDaoImpl extends BancoGenericDaoImpl<Clientes, Integer> implements ClientesDao {

    @Override
    public void registrarCliente(Clientes cliente) {
        this.registrarCliente(cliente);
    }

    @Override
    public Clientes consultarCliente(int documento) {
        return this.consultarCliente(documento);
    }

    @Override
    public List<Clientes> listaDeClientes() {
        return this.listaDeClientes();
    }

}
