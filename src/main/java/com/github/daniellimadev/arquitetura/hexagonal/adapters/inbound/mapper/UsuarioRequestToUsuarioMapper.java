package com.github.daniellimadev.arquitetura.hexagonal.adapters.inbound.mapper;


import com.github.daniellimadev.arquitetura.hexagonal.adapters.inbound.request.UsuarioRequest;
import com.github.daniellimadev.arquitetura.hexagonal.application.core.domain.Usuario;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UsuarioRequestToUsuarioMapper {

    public Usuario mapper(UsuarioRequest usuarioRequest){
        var usuario = new Usuario();
        BeanUtils.copyProperties(usuarioRequest, usuario);
        return usuario;
    }

}
