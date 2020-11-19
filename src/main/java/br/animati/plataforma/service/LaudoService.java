package br.animati.plataforma.service;

import br.animati.plataforma.entity.Laudo;

import java.util.List;

public interface LaudoService {
    void cadastrar(Laudo laudo);
    List<Laudo> listar();
    void editar(Laudo laudo);
    void deletar(long id);
    Laudo listarPeloId(long id);
}
