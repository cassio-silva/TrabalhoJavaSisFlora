/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SisFloraRepositorios;

import ClassesDAO.ClienteDAO;
import Dominio.Cliente;
import InterfaceDAO.IDAO;
import SisFloraComumRepositorioInterfaces.IRepositorioGenerico;
import java.util.List;

/**
 *
 * @author Cassio
 */
public class ProdutoRepositorio implements IRepositorioGenerico<Cliente, Integer>{
    
    private IDAO<Cliente, Integer> _clienteDAO = new ClienteDAO();
    
    @Override
    public List<Cliente> selecionar() {
        return _clienteDAO.selecionar();
    }

    @Override
    public Cliente selecionarPorId(Integer id) {
        return _clienteDAO.selecionarPorId();
    }

    @Override
    public void inserir(Cliente modelo) {
        _clienteDAO.inserir();
    }

    @Override
    public void atualizar(Cliente modelo) {
        _clienteDAO.atualizar();
    }

    @Override
    public void excluirPorId(Integer id) {
        _clienteDAO.excluirPorId();
    }
    
}
