package com.github.daniellimadev.arquitetura.hexagonal.application.core.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Endereco implements Serializable {

    private String cep;

    private String logradouro;

    private String uf;

    private String cidade;


}
