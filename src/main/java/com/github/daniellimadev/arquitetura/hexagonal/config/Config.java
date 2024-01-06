package com.github.daniellimadev.arquitetura.hexagonal.config;

import com.github.daniellimadev.arquitetura.hexagonal.adapters.outbound.BuscarEnderecoAdapter;
import com.github.daniellimadev.arquitetura.hexagonal.adapters.outbound.SalvarUsuarioAdapter;
import com.github.daniellimadev.arquitetura.hexagonal.application.core.service.SalvarUsuarioService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
	public SalvarUsuarioService salvarUsuarioService(SalvarUsuarioAdapter salvarUsuarioAdapter, BuscarEnderecoAdapter buscarEnderecoAdapter){
		return new SalvarUsuarioService(salvarUsuarioAdapter, buscarEnderecoAdapter);
	}
}
