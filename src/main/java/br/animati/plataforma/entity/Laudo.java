package br.animati.plataforma.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Laudo {
    private long id;
    private String text;
    private Medico medico;
    private Atendimento atendimento;

}
