package br.animati.plataforma.service;

import br.animati.plataforma.dao.AtendimentoDAO;
import br.animati.plataforma.dao.AtendimentoDAOImpl;
import br.animati.plataforma.entity.Atendimento;

import java.util.List;

public class AtendimentoServiceImpl implements AtendimentoService{

    private AtendimentoDAO DAO = new AtendimentoDAOImpl();

    public void cadastrar(Atendimento atendimento) {
        DAO.cadastrar(atendimento);
    }

    public List<Atendimento> listar() {
        return DAO.listar();
    }

    public void editar(Atendimento atendimento) {
        DAO.editar(atendimento);
    }

    public void deletar(long id) {
        DAO.deletar(id);
    }

    public Atendimento listarPeloId(long id) {
        return DAO.listarPeloId(id);
    }
}
