package com.github.daniellimadev.arquitetura.hexagonal.adapters.inbound.mapper;

import com.github.daniellimadev.arquitetura.hexagonal.adapters.inbound.entity.UsuarioEntity;
import com.github.daniellimadev.arquitetura.hexagonal.application.core.domain.Usuario;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UsuarioEntityToUsuarioMapper {

     public Usuario mapper(UsuarioEntity usuarioEntity){
          var usuario = new Usuario();
          BeanUtils.copyProperties(usuarioEntity, usuario);
          return usuario;
     }

}
