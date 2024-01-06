package com.github.daniellimadev.arquitetura.hexagonal.application.ports.in;


import com.github.daniellimadev.arquitetura.hexagonal.application.core.domain.Usuario;

public interface SalvarUsuarioServicePort {
    Usuario salvarUsuario(Usuario usuario, String cep);
}
