package com.github.daniellimadev.arquitetura.hexagonal.application.core.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Usuario {

    private Long id;

    private String nome;

    private String instagram;

    private String linkedin;

    private String github;

    private LocalDate dataNascimento;

    private Endereco endereco;


}
