package com.algawoks.algafood.di.service;

import org.springframework.stereotype.Component;

import com.algawoks.algafood.di.modelo.Cliente;
import com.algawoks.algafood.di.notificacao.Notificador;
import com.algawoks.algafood.di.notificacao.NotificadorEmail;

public class AtivacaoClienteService {
	
	private Notificador notificador;
	
	public AtivacaoClienteService(NotificadorEmail notificador) {
		this.notificador = notificador;
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
