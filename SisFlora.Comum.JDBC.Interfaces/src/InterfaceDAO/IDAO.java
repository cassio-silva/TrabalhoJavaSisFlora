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
public interface IDAO<Modelo, Chave> {
    List<Modelo> Selecionar();
    Modelo SelecionarPorId();
    void Inserir();
    void Atualizar();
    void ExcluirPorId();
}
