package com.github.daniellimadev.arquitetura.hexagonal.adapters.inbound.mapper;

import com.github.daniellimadev.arquitetura.hexagonal.adapters.inbound.entity.UsuarioEntity;
import com.github.daniellimadev.arquitetura.hexagonal.application.core.domain.Usuario;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UsuarioToUsuarioEntityMapper {
     public UsuarioEntity mapper(Usuario usuario){
          var usuarioEntity = new UsuarioEntity();
          BeanUtils.copyProperties(usuario, usuarioEntity);
          return usuarioEntity;
     }

}
