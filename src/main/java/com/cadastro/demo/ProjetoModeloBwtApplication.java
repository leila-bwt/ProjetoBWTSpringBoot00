package com.cadastro.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.cadastro.model.entity"}) //mapeamendo das entidades
@EnableJpaRepositories (basePackages = {"com.cadastro.repositories"})// mapeamento do repositorio
@ComponentScan(basePackages = {"com.cadastro.controller", "com.cadastro.service", "com.cadastro.service.impl"})
@SpringBootApplication // mapeamento dos componentes
public class ProjetoModeloBwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoModeloBwtApplication.class, args);
	}

}
