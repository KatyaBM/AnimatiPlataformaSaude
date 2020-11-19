package br.animati.plataforma.dao;

import br.animati.plataforma.entity.Atendimento;

import java.util.ArrayList;
import java.util.List;

public class AtendimentoDAOImpl implements AtendimentoDAO{
    private List<Atendimento> atendimentos = new ArrayList<Atendimento>();
    public void cadastrar(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    public List<Atendimento> listar() {
        return atendimentos;
    }

    public void editar(Atendimento atendimento) {
        Atendimento aux = null;
        boolean found = false;
        int index = 0;
        do{
            aux = atendimentos.get(index);
            if(aux.getId()==atendimento.getId()) {
                atendimentos.add(index,atendimento);
                found=true;
            }
            index++;
        }while(!found);
    }

    public void deletar(long id) {
        atendimentos.remove(listarPeloId(id));
    }

    public Atendimento listarPeloId(long id) {
        Atendimento retorno;
        boolean achou = false;
        int index = 0;
        do{
            retorno = atendimentos.get(index);
            if(retorno.getId() == id){
                achou = true;
            }else{
                index++;
            }
        }while (achou != true);
        return retorno;
    }
}
