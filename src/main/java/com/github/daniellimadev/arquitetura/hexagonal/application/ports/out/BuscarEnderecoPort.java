package com.github.daniellimadev.arquitetura.hexagonal.application.ports.out;


import com.github.daniellimadev.arquitetura.hexagonal.application.core.domain.Endereco;

public interface BuscarEnderecoPort {
    Endereco buscar(String cep);
}
