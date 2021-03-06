package SisFloraRepositorios;

import ClassesDAO.*;
import Dominio.Cliente;
import InterfaceDAO.IDAO;
import SisFloraComumRepositorioInterfaces.IRepositorioGenerico;
import java.util.List;

/**
 *
 * @author Cassio
 */
public class ClienteRepositorio implements IRepositorioGenerico<Cliente, Integer>{
    
    private IDAO<Cliente, Integer> _clienteDAO = new ClienteDAO();
    
    @Override
    public List<Cliente> selecionar() {
        return _clienteDAO.selecionar();
    }

    @Override
    public Cliente selecionarPorId(Integer id) {
        return _clienteDAO.selecionarPorId(id);
    }

    @Override
    public void inserir(Cliente modelo) {
        _clienteDAO.inserir(modelo);
    }

    @Override
    public void atualizar(Cliente modelo) {
        _clienteDAO.atualizar(modelo);
    }

    @Override
    public void excluirPorId(Integer id) {
        _clienteDAO.excluirPorId(id);
    }
}