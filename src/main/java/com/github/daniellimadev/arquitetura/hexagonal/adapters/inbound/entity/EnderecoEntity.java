package com.github.daniellimadev.arquitetura.hexagonal.adapters.inbound.entity;



import com.github.daniellimadev.arquitetura.hexagonal.application.core.domain.Endereco;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class EnderecoEntity extends Endereco {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;

}
