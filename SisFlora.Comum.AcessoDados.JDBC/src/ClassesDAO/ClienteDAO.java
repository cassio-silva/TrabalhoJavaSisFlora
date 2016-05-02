/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import Dominio.Cliente;
import InterfaceDAO.IDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.JOptionPane;
import postgreSql.PostgreSqlFactory;

public class ClienteDAO implements IDAO<Cliente, Integer>
{
    @Override
    public List<Cliente> selecionar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente selecionarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserir(Cliente cliente) {
        try{            
            Connection conexao = PostgreSqlFactory.createConnection();
            String sql = "INSERT INTO Contato (Nome, Telefone, Email, Rg, Cpf, Senha, Logradouro, Complemento, Bairro, Cidade, Estado, Cep, DataNascimento, Sexto) VALUES ("+cliente.getNome()+","+ cliente.getTelefone()+","+cliente.getEmail()+
                                                                       ","+cliente.getRG()+","+cliente.getCPF()+","+cliente.getSenha()+","+cliente.getLogradouro()+","+cliente.getComplemento()+","+cliente.getBairro()+","+cliente.getCidade()+","+cliente.getCEP()+
                                                                       ","+cliente.getDataNasc()+", 1";
            PreparedStatement stmt = PostgreSqlFactory.criarComandoSql(conexao, sql);
            PostgreSqlFactory.executarComandoSql(conexao, stmt, sql);
            conexao.close();
            
        }catch(Exception exc)
        {
            JOptionPane.showMessageDialog(null, exc);
        }
    }

    @Override
    public void atualizar(Cliente entidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluirPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
