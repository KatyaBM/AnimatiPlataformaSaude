package br.animati.plataforma;

import br.animati.plataforma.entity.Atendimento;
import br.animati.plataforma.entity.Medico;
import br.animati.plataforma.service.AtendimentoService;
import br.animati.plataforma.service.AtendimentoServiceImpl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AtendimentoServiceTest {
    private AtendimentoService atendimentoService;

    @Before
    public void init(){
        Medico medico = new Medico();
        medico.setId(0);
        medico.setNome("José");

        Atendimento atendimento = new Atendimento();
        atendimento.setMedico(medico);
        atendimento.setId(0);

        atendimentoService = new AtendimentoServiceImpl();
        atendimentoService.cadastrar(atendimento);
    }

    @Test
    public void cadastrar(){
        Medico medico = new Medico();
        medico.setId(1);
        medico.setNome("José");

        Atendimento atendimento = new Atendimento();
        atendimento.setMedico(medico);
        atendimento.setId(1);
        atendimento.setPaciente("Maria");

        atendimentoService.cadastrar(atendimento);

        assertTrue(atendimento.equals(atendimentoService.listarPeloId(1)));
    }

    @Test
    public void listar(){
        Medico medico = new Medico();
        medico.setId(1);
        medico.setNome("José");

        Atendimento atendimento = new Atendimento();
        atendimento.setMedico(medico);
        atendimento.setId(1);
        atendimento.setPaciente("Maria");

        atendimentoService.cadastrar(atendimento);

        assertEquals(2,atendimentoService.listar().size());
    }

    @Test
    public void editar(){
        Medico medico = new Medico();
        medico.setId(2);
        medico.setNome("Marcos");

        Atendimento atendimento = atendimentoService.listarPeloId(0);
        atendimento.setMedico(medico);

        atendimentoService.editar(atendimento);

        assertEquals(medico.getNome(),atendimentoService.listarPeloId(0).getMedico().getNome());
    }

    @Test
    public void listarPeloId(){
        assertEquals("José",atendimentoService.listarPeloId(0).getMedico().getNome());
    }

    @Test
    public void delete(){
        atendimentoService.deletar(0);
        assertEquals(0,atendimentoService.listar().size());
    }
}
