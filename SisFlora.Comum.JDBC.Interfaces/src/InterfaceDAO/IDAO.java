/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceDAO;

import java.util.List;

/**
 *
 * @author Cassio
 */
public interface IDAO<Modelo extends Object, Chave> {
    List<Modelo> selecionar();
    Modelo selecionarPorId(Chave id);
    void inserir(Modelo entidade);
    void atualizar(Modelo entidade);
    void excluirPorId(Chave id);
}
