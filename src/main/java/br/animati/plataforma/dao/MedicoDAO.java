package br.animati.plataforma.dao;

import br.animati.plataforma.entity.Medico;

import java.util.List;

public interface MedicoDAO {

    void cadastrar(Medico medico);

    List<Medico> listar();

    void editar(Medico medico);

    void deletar(long id);

    Medico listarPeloId(long id);
}
