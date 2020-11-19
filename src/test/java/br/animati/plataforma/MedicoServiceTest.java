package br.animati.plataforma;

import br.animati.plataforma.entity.Medico;
import br.animati.plataforma.service.MedicoService;
import br.animati.plataforma.service.MedicoServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedicoServiceTest {
    private MedicoService medicoService;

    @Before
    public void init(){
        medicoService = new MedicoServiceImpl();
        Medico medico = new Medico();
        medico.setId(0);
        medico.setNome("João");
        medicoService.cadastrar(medico);
    }

    @Test
    public void cadastrar(){
        Medico medico = new Medico();
        medico.setId(1);
        medico.setNome("José");

        medicoService.cadastrar(medico);

        assertTrue(medico.equals(medicoService.listarPeloId(1)));
    }

    @Test
    public void listar(){
        Medico medico = new Medico();
        medico.setId(1);
        medico.setNome("Maria");

        medicoService.cadastrar(medico);

        assertEquals(2,medicoService.listar().size());
    }

    @Test
    public void editar(){
        Medico medico = new Medico();
        medico.setId(0);
        medico.setNome("Maria");

        medicoService.editar(medico);

        assertEquals(medico.getNome(),medicoService.listarPeloId(0).getNome());
    }

    @Test
    public void listarPeloId(){
        assertEquals("João",medicoService.listarPeloId(0).getNome());
    }

    @Test
    public void delete(){
        medicoService.deletar(0);
        assertEquals(0,medicoService.listar().size());
    }

}
