package com.cadastro.model.entity;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import com.cadastro.model.enums.StatusHospedagem;

@Entity
@Table(name="hospedagem")
public class Hospedagem {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	@Column
	private Integer estabelecimento;
	
	@Column
	private Integer reserva;
	
	@Column(name = "dataentrada")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
	private LocalDate dataentrada;
	
	@Column(name = "datasaida")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
	private LocalDate datasaida;
	
	@Column(name = "stats")
	@Enumerated(value = EnumType.STRING)
	private StatusHospedagem status;

}
