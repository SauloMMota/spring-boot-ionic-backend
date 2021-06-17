package com.saulomendes.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.saulomendes.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
