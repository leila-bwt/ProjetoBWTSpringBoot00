package com.cadastro.services;

import java.util.Optional;

import com.cadastro.model.entity.Passageiro;

public interface PassageiroService {
	
	Passageiro autenticar(String email, String senha);
	
	Passageiro salvarPassageiro(Passageiro passageiro);
	
	void validarEmail(String email);
	
	Optional<Passageiro> buscarPorID(Long id);

	Optional<Passageiro> buscarPorId(Long id);

}
