package com.github.jntlvr;

import java.util.Date;
public class PessoaFisica {
    private String nome;
    private String sexo;
    private Date dataNascimento;

    public PessoaFisica(String nome, String sexo, Date dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }
}
