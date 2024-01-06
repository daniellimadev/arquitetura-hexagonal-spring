package com.github.daniellimadev.arquitetura.hexagonal.adapters.outbound.repository;

import com.github.daniellimadev.arquitetura.hexagonal.adapters.inbound.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
