package com.algawoks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algawoks.algafood.di.modelo.Cliente;
import com.algawoks.algafood.di.notificacao.Notificador;
import com.algawoks.algafood.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {
	
	@Autowired(required = false) //
	private Notificador notificador;
	
	@Autowired
	public AtivacaoClienteService(NotificadorEmail notificador) {
		this.notificador = notificador;
	}
	
//	public AtivacaoClienteService(String string) {
//		
//	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		if(notificador != null) {
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		} else {
			System.out.println("Cliente ativado sem notificador"); 
		}
		
	}

	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}

	
}
