package com.anachequer.labs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class LabController {

	@Autowired
	private DataHora dataHora;
	
	@Autowired
	private ConsultaCep consultaCep;

	@GetMapping("/greeting/{nome}")
	public String buscar(@PathVariable String nome) {
		return ("Olá " + nome + ", hoje é " + dataHora.obterDataHora());
	}
	
	@GetMapping("cep/{cep}/full-adress")
	public String buscarEndereco(@PathVariable("cep") String cep) {
		EnderecoCompleto enderecoCompleto = consultaCep.getEnderecoCompleto(cep);
		return "Seu endereço completo é " + this.formataEnderecoCompleto(enderecoCompleto);
	}
	
	private String formataEnderecoCompleto(EnderecoCompleto enderecoCompleto) {
		return enderecoCompleto.getLogradouro() + ", " + enderecoCompleto.getBairro()  + ", " + enderecoCompleto.getLocalidade() + " - " + enderecoCompleto.getUf(); 
	}

}
