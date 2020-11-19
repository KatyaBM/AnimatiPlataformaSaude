package br.animati.plataforma.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Medico {
    private long id;
    private String nome;
    private String uf;
    private String crm;

}
