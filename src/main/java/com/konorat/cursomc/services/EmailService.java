package com.konorat.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.konorat.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
