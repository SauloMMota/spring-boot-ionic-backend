package com.saulomendes.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.saulomendes.cursomc.services.DBService;
import com.saulomendes.cursomc.services.EmailService;
import com.saulomendes.cursomc.services.MockEmailService;
import com.saulomendes.cursomc.services.SmtpEmailService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		dbService.instantiateTestDatabase();
		return true;
	}
	//Quando se faz um método com @Bean, o método vai ta disponível como componente do sistema
	/*@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}*/
	
	@Bean
	public EmailService emailService() {
		return new SmtpEmailService();
	}
}
