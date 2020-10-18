package com.algawoks.algafood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.algawoks.algafood.di.notificacao.NotificadorEmail;
import com.algawoks.algafood.di.service.AtivacaoClienteService;

@Configuration
public class AlgaConfig {
	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.algamail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
	@Bean
	public AtivacaoClienteService ativarCliente() {
		return new AtivacaoClienteService(notificadorEmail());
	}
}
