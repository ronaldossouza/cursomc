package com.ronaldo.services;

import org.springframework.mail.SimpleMailMessage;

import com.ronaldo.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
}
