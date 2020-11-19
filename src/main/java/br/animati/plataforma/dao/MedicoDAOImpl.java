package br.animati.plataforma.dao;

import br.animati.plataforma.entity.Medico;

import java.util.ArrayList;
import java.util.List;

public class MedicoDAOImpl implements MedicoDAO {
    private List<Medico> medicos = new ArrayList<Medico>();
    public void cadastrar(Medico medico) {
        medicos.add(medico);
    }

    public List<Medico> listar() {
        return medicos;
    }

    public void editar(Medico medico) {
        Medico aux;
        boolean found = false;
        int index = 0;
        do{
            aux = medicos.get(index);
            if(aux.getId()==medico.getId()) {
                medicos.add(index,medico);
                found=true;
            }
            index++;
        }while(!found);
    }

    public void deletar(long id) {
        medicos.remove(listarPeloId(id));
    }

    public Medico listarPeloId(long id) {
        Medico retorno;
        boolean achou = false;
        int index = 0;
        do{
            retorno = medicos.get(index);
            if(retorno.getId() == id){
                achou = true;
            }else{
                index++;
            }
        }while (achou != true);
        return retorno;
    }
}
