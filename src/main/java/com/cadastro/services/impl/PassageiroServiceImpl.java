package com.cadastro.services.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro.exception.ErroAutenticacao;
import com.cadastro.exception.RegraNegocioException;
import com.cadastro.model.entity.Passageiro;
import com.cadastro.repositories.PassageiroRepository;
import com.cadastro.services.PassageiroService;


@Service
public class PassageiroServiceImpl implements PassageiroService {
	
	@Autowired
	private PassageiroRepository repository;

	@Override
	public Passageiro autenticar(String email, String senha) {
		Optional<Passageiro> passageiro = repository.findByEmail(email);
		
		if(!passageiro.isPresent()) {
			throw new ErroAutenticacao("Viajante não encontrado!");
		}
		
		if(!passageiro.get().getSenha().equals(senha)) {
			throw new ErroAutenticacao("Ops... senha incorreta.");
		}
		
		return passageiro.get();
	}
	
	@Override
	@Transactional // quando houver manipulação dentro do db
	public Passageiro salvarPassageiro (Passageiro passageiro) {
		validarEmail(passageiro.getEmail());
		return repository.save(passageiro);
	}
	
	@Override
	public void validarEmail(String email) {
		boolean existe = repository.existsByEmail(email);
		if (existe) {
			throw new RegraNegocioException("Já existe viajante cadastrado com esse e-mail");
		}
	}
	
	@Override
	public Optional<Passageiro> buscarPorId(Long id){
		return repository.findById(id);
		
	}

	@Override
	public Optional<Passageiro> buscarPorID(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
}
