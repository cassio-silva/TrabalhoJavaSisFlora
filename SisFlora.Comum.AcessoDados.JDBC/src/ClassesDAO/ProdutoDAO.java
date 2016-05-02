/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import Dominio.Produto;
import InterfaceDAO.IDAO;
import postgreSql.PostgreSqlFactory;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cassio
 */
public class ProdutoDAO implements IDAO<Produto, Integer> {

    @Override
    public List<Produto> selecionar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto selecionarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserir(Produto entidade) {
        //...
    }

    @Override
    public void atualizar(Produto entidade) {
        //...
    }

    @Override
    public void excluirPorId(Integer id) {
        //...
    }

}
