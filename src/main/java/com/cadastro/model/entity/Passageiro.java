package com.cadastro.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "passageiro")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Passageiro {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JoinColumn(name = "id_passageiro")
	private String nomeCompleto;
	
	@Column
	private String endereco;
	
	@Column
	private int cep;
	
	@Column
	private String email;
	
	@Column 
	private String contato;
	
	@Column
	private String senha;
	

	
	
	
	

}
