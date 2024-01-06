package com.github.daniellimadev.arquitetura.hexagonal.application.core.service;


import com.github.daniellimadev.arquitetura.hexagonal.application.core.domain.Usuario;
import com.github.daniellimadev.arquitetura.hexagonal.application.ports.in.SalvarUsuarioServicePort;
import com.github.daniellimadev.arquitetura.hexagonal.application.ports.out.BuscarEnderecoPort;
import com.github.daniellimadev.arquitetura.hexagonal.application.ports.out.SalvarUsuarioPort;

public class SalvarUsuarioService implements SalvarUsuarioServicePort {

    private final SalvarUsuarioPort salvarUsuarioPort;

    private final BuscarEnderecoPort buscarEnderecoPort;


    public SalvarUsuarioService(SalvarUsuarioPort salvarUsuarioPort, BuscarEnderecoPort buscarEnderecoPort) {
        this.salvarUsuarioPort = salvarUsuarioPort;
        this.buscarEnderecoPort = buscarEnderecoPort;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario, String cep) {

        var endereco = buscarEnderecoPort.buscar(cep);
        usuario.setEndereco(endereco);

        return salvarUsuarioPort.salvar(usuario);
    }
}
