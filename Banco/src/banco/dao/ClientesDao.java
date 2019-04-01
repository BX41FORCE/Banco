/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.dao;

import banco.vo.Clientes;
import java.util.List;

/**
 *
 * @author bcortez
 */
public interface ClientesDao {

    public void registrarCliente(Clientes cliente);

    public Clientes consultarCliente(int documento);

    public List<Clientes> listaDeClientes();
}
