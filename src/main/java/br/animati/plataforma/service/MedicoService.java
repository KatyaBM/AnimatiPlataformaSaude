package br.animati.plataforma.service;

import br.animati.plataforma.entity.Medico;

import java.util.List;

public interface MedicoService {
    void cadastrar(Medico medico);
    List<Medico> listar();
    void editar(Medico medico);
    void deletar(long id);
    Medico listarPeloId(long id);
}
