package com.cadastro.repositories;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.model.entity.Passageiro;

public interface PassageiroRepository extends JpaRepository<Passageiro, Long>{
	
	boolean existsByEmail(String email); 
	
	Optional<Passageiro> findByEmail(String email);

}
