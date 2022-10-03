package com.anachequer.labs;

import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;

import org.springframework.stereotype.Component;

@Component
public class DataHora {
	
	public String obterDataHora() {
		
		Calendar calendar = Calendar.getInstance();
		Date agora = calendar.getTime();
		DateFormat dataHora = DateFormat.getDateTimeInstance();
		
		return dataHora.format(agora);
		
	}
	
	

}
