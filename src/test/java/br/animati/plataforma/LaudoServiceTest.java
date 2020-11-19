package br.animati.plataforma;

import br.animati.plataforma.entity.Atendimento;
import br.animati.plataforma.entity.Laudo;
import br.animati.plataforma.entity.Medico;
import br.animati.plataforma.service.LaudoService;
import br.animati.plataforma.service.LaudoServiceImpl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LaudoServiceTest {
    LaudoService laudoService;
    @Before
    public void init(){
        laudoService = new LaudoServiceImpl();

        Medico medico = new Medico();
        medico.setId(0);
        medico.setNome("José");

        Atendimento atendimento = new Atendimento();
        atendimento.setMedico(medico);
        atendimento.setId(0);

        Laudo laudo = new Laudo();
        laudo.setId(0);
        laudo.setMedico(atendimento.getMedico());
        laudo.setAtendimento(atendimento);

        laudoService.cadastrar(laudo);
    }


}
