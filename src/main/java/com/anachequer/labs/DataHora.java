package com.anachequer.labs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class DataHora {
	
	public String obterDataHora() {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		String dataHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		return dataHora;
		
	}
	
}
