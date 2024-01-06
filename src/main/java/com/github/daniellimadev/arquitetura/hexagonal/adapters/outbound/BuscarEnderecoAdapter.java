package com.github.daniellimadev.arquitetura.hexagonal.adapters.outbound;

import com.github.daniellimadev.arquitetura.hexagonal.adapters.outbound.rest.BuscarEnderecoRest;
import com.github.daniellimadev.arquitetura.hexagonal.application.core.domain.Endereco;
import com.github.daniellimadev.arquitetura.hexagonal.application.ports.out.BuscarEnderecoPort;
import org.springframework.stereotype.Component;

@Component
public class BuscarEnderecoAdapter implements BuscarEnderecoPort {

    private final BuscarEnderecoRest buscarEnderecoRest;

    public BuscarEnderecoAdapter(BuscarEnderecoRest buscarEnderecoRest) {
        this.buscarEnderecoRest = buscarEnderecoRest;
    }


    @Override
    public Endereco buscar(String cep) {
        var endereco = buscarEnderecoRest.buscar(cep);

        return endereco.getBody();
    }
}
