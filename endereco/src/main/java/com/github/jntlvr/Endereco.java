package com.github.jntlvr;

public class Endereco {
    private Logradouro logradouro;
    private Integer numero;
    private Bairro bairro;
    private String cep;
    private TipoEndereco tipo;

    public Endereco(Integer numero, Bairro bairro, String cep){
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
    }
}
