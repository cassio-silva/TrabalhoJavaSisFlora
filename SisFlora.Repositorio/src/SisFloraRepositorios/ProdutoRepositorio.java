/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SisFloraRepositorios;

import ClassesDAO.ProdutoDAO;
import Dominio.Produto;
import InterfaceDAO.IDAO;
import SisFloraComumRepositorioInterfaces.IRepositorioGenerico;
import java.util.List;

/**
 *
 * @author Cassio
 */
public class ProdutoRepositorio implements IRepositorioGenerico<Produto, Integer>{
    
    private IDAO<Produto, Integer> _ProdutoDAO = new ProdutoDAO();
    
    @Override
    public List<Produto> selecionar() {
        return _ProdutoDAO.selecionar();
    }

    @Override
    public Produto selecionarPorId(Integer id) {
        return _ProdutoDAO.selecionarPorId(id);
    }

    @Override
    public void inserir(Produto modelo) {
        _ProdutoDAO.inserir(modelo);
    }

    @Override
    public void atualizar(Produto modelo) {
        _ProdutoDAO.atualizar(modelo);
    }

    @Override
    public void excluirPorId(Integer id) {
        _ProdutoDAO.excluirPorId(id);
    }
    
}
