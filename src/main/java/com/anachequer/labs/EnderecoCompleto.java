package com.anachequer.labs;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class EnderecoCompleto {

	private String logradouro;
	private String bairro;
	private String localidade;
	private String uf;
	private String cep;

}
