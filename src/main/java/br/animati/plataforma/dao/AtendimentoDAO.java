package br.animati.plataforma.dao;

import br.animati.plataforma.entity.Atendimento;

import java.util.List;

public interface AtendimentoDAO {
    void cadastrar(Atendimento atendimento);
    List<Atendimento> listar();
    void editar(Atendimento atendimento);
    void deletar(long id);
    Atendimento listarPeloId(long id);
}
