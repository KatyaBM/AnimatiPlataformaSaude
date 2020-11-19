package br.animati.plataforma.service;

import br.animati.plataforma.entity.Atendimento;

import java.util.List;

public interface AtendimentoService {
    void cadastrar(Atendimento atendimento);
    List<Atendimento> listar();
    void editar(Atendimento atendimento);
    void deletar(long id);
    Atendimento listarPeloId(long id);
}
