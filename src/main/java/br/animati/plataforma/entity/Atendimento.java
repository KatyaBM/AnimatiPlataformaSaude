package br.animati.plataforma.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class Atendimento {
    private long id;
    private Date dataHora;
    private String nomeProcedimento;
    private String modalidade;
    private Medico medico;
    private String paciente;
}
