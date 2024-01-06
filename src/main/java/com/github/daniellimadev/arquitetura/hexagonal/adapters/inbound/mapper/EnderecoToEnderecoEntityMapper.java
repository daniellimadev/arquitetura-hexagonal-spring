package com.github.daniellimadev.arquitetura.hexagonal.adapters.inbound.mapper;


import com.github.daniellimadev.arquitetura.hexagonal.adapters.inbound.entity.EnderecoEntity;
import com.github.daniellimadev.arquitetura.hexagonal.application.core.domain.Endereco;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class EnderecoToEnderecoEntityMapper {

    public EnderecoEntity mapper(Endereco endereco){
        var enderecoEntity = new EnderecoEntity();
        BeanUtils.copyProperties(endereco, enderecoEntity);
        return enderecoEntity;
    }

}
