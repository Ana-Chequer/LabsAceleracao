package com.anachequer.labs;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "enderecoCompleto", url = "https://viacep.com.br/")
public interface ConsultaCep {
	
	@RequestMapping("ws/{cep}/json/")
	public EnderecoCompleto getEnderecoCompleto(@PathVariable("cep") String cep);

}
