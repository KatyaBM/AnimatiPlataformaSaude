package br.animati.plataforma.service;

import br.animati.plataforma.dao.MedicoDAO;
import br.animati.plataforma.dao.MedicoDAOImpl;
import br.animati.plataforma.entity.Medico;

import java.util.List;

public class MedicoServiceImpl implements MedicoService{

    public MedicoDAO medicoDAOImpl = new MedicoDAOImpl();

    public void cadastrar(Medico medico) {
        medicoDAOImpl.cadastrar(medico);
    }

    public List<Medico> listar() {
        return medicoDAOImpl.listar();
    }

    public void editar(Medico medico) {
        medicoDAOImpl.editar(medico);
    }

    public void deletar(long id) {
        medicoDAOImpl.deletar(id);
    }

    public Medico listarPeloId(long id) {
        return medicoDAOImpl.listarPeloId(id);
    }
}
