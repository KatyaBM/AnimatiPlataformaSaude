package br.animati.plataforma.dao;

import br.animati.plataforma.entity.Laudo;

import java.util.ArrayList;
import java.util.List;

public class LaudoDAOImpl implements LaudoDAO{
    private List<Laudo> laudos = new ArrayList<Laudo>();
    public void cadastrar(Laudo laudo) {
        laudos.add(laudo);
    }

    public List<Laudo> listar() {
        return laudos;
    }

    public void editar(Laudo laudo) {
        Laudo aux = null;
        boolean found = false;
        int index = 0;
        do{
            aux = laudos.get(index);
            if(aux.getId()==laudo.getId()) {
                laudos.add(index,laudo);
                found=true;
            }
            index++;
        }while(!found);
    }

    public void deletar(long id) {
        laudos.remove(listarPeloId(id));
    }

    public Laudo listarPeloId(long id) {
        Laudo retorno;
        boolean achou = false;
        int index = 0;
        do{
            retorno = laudos.get(index);
            if(retorno.getId() == id){
                achou = true;
            }else{
                index++;
            }
        }while (achou != true);
        return retorno;
    }
}
