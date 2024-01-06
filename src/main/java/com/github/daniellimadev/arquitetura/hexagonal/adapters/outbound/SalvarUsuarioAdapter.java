package com.github.daniellimadev.arquitetura.hexagonal.adapters.outbound;

import com.github.daniellimadev.arquitetura.hexagonal.adapters.inbound.mapper.EnderecoToEnderecoEntityMapper;
import com.github.daniellimadev.arquitetura.hexagonal.adapters.inbound.mapper.UsuarioEntityToUsuarioMapper;
import com.github.daniellimadev.arquitetura.hexagonal.adapters.inbound.mapper.UsuarioToUsuarioEntityMapper;
import com.github.daniellimadev.arquitetura.hexagonal.adapters.outbound.repository.UsuarioRepository;
import com.github.daniellimadev.arquitetura.hexagonal.application.core.domain.Usuario;
import com.github.daniellimadev.arquitetura.hexagonal.application.ports.out.SalvarUsuarioPort;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;



@Component
public class SalvarUsuarioAdapter implements SalvarUsuarioPort {

    private final UsuarioRepository usuarioRepository;

    private final UsuarioToUsuarioEntityMapper usuarioToUsuarioEntityMapper;

    private final UsuarioEntityToUsuarioMapper usuarioToUsuarioEntitymMapper;

    private final EnderecoToEnderecoEntityMapper enderecoToEnderecoEntityMapper;

    public SalvarUsuarioAdapter(UsuarioRepository usuarioRepository, UsuarioToUsuarioEntityMapper usuarioToUsuarioEntityMapper, UsuarioEntityToUsuarioMapper usuarioToUsuarioEntitymMapper, EnderecoToEnderecoEntityMapper enderecoToEnderecoEntityMapper) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioToUsuarioEntityMapper = usuarioToUsuarioEntityMapper;
        this.usuarioToUsuarioEntitymMapper = usuarioToUsuarioEntitymMapper;
        this.enderecoToEnderecoEntityMapper = enderecoToEnderecoEntityMapper;
    }

    @Override
    @Transactional
    public Usuario salvar(Usuario usuario) {
        var usuarioEntity = usuarioToUsuarioEntityMapper.mapper(usuario);
        var enderecoEntity = enderecoToEnderecoEntityMapper.mapper(usuario.getEndereco());
        usuarioEntity.setEndereco(enderecoEntity);
        return usuarioToUsuarioEntitymMapper.mapper(usuarioRepository.save(usuarioEntity));
    }
}
