package br.animati.plataforma.service;

import br.animati.plataforma.dao.LaudoDAO;
import br.animati.plataforma.dao.LaudoDAOImpl;
import br.animati.plataforma.entity.Laudo;

import java.util.List;

public class LaudoServiceImpl implements LaudoService{

    private LaudoDAO DAO = new LaudoDAOImpl();

    public void cadastrar(Laudo laudo) {
        DAO.cadastrar(laudo);
    }

    public List<Laudo> listar() {
        return DAO.listar();
    }

    public void editar(Laudo laudo) {
        DAO.editar(laudo);
    }

    public void deletar(long id) {
        DAO.deletar(id);
    }

    public Laudo listarPeloId(long id) {
        return DAO.listarPeloId(id);
    }
}
