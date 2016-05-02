/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SisFloraComumRepositorioInterfaces;

import java.util.List;

/**
 * @param <Modelo> Recebe uma entidade Object
 * @param <Chave> Recebe a Chave primaria da entidade
 * @author Cassio
 */
public interface IRepositorioGenerico<Modelo extends Object, Chave> {
    List<Modelo> selecionar();
    Modelo selecionarPorId(Chave id);
    void inserir(Modelo modelo);
    void atualizar(Modelo modelo);
    void excluirPorId(Chave id);
}
