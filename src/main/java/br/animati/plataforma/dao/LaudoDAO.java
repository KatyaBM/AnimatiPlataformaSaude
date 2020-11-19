package br.animati.plataforma.dao;

import br.animati.plataforma.entity.Laudo;

import java.util.List;

public interface LaudoDAO {
    void cadastrar(Laudo laudo);
    List<Laudo> listar();
    void editar(Laudo laudo);
    void deletar(long id);
    Laudo listarPeloId(long id);
}
