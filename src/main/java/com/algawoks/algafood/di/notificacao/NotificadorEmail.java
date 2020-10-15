package com.algawoks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algawoks.algafood.di.modelo.Cliente;

@Component
public class NotificadorEmail {
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificado %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
