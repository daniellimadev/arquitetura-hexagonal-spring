package com.github.daniellimadev.arquitetura.hexagonal.application.ports.out;


import com.github.daniellimadev.arquitetura.hexagonal.application.core.domain.Usuario;

public interface SalvarUsuarioPort {
    Usuario salvar(Usuario usuario);
}
