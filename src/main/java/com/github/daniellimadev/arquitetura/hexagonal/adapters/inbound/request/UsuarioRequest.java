package com.github.daniellimadev.arquitetura.hexagonal.adapters.inbound.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
public class UsuarioRequest {

    private String nome;

    private String instagram;

    private String linkedin;

    private String github;

    private LocalDate dataNascimento;

    private String cep;

}
