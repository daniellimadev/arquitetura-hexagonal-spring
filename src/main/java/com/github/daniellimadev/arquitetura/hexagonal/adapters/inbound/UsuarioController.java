package com.github.daniellimadev.arquitetura.hexagonal.adapters.inbound;

import com.github.daniellimadev.arquitetura.hexagonal.adapters.inbound.mapper.UsuarioRequestToUsuarioMapper;
import com.github.daniellimadev.arquitetura.hexagonal.adapters.inbound.request.UsuarioRequest;
import com.github.daniellimadev.arquitetura.hexagonal.application.core.domain.Usuario;
import com.github.daniellimadev.arquitetura.hexagonal.application.ports.in.SalvarUsuarioServicePort;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final SalvarUsuarioServicePort salvarUsuarioServicePort;

    private final UsuarioRequestToUsuarioMapper usuarioRequestToUsuarioMapper;

    public UsuarioController(SalvarUsuarioServicePort salvarUsuarioServicePort, UsuarioRequestToUsuarioMapper usuarioRequestToUsuarioMapper) {
        this.salvarUsuarioServicePort = salvarUsuarioServicePort;
        this.usuarioRequestToUsuarioMapper = usuarioRequestToUsuarioMapper;
    }

    @PostMapping
    public Usuario salvarUsuario(@RequestBody UsuarioRequest usuarioRequest){
        var usuario = usuarioRequestToUsuarioMapper.mapper(usuarioRequest);
        return salvarUsuarioServicePort.salvarUsuario(usuario, usuarioRequest.getCep());
    }

}
