package com.com.developer.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // adicionar get and setters
@AllArgsConstructor // criar os contrutores da entidade criada
@NoArgsConstructor // para criar contrutor vazio
@Builder // criar o objeto cliente
@Entity
public class Cliente implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "cpf")
	private String cpf;

	public Long getId() {
		return null;
	}

	
}
