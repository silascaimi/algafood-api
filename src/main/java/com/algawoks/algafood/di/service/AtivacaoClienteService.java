package com.algawoks.algafood.di.service;

import org.springframework.stereotype.Component;

import com.algawoks.algafood.di.modelo.Cliente;
import com.algawoks.algafood.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	private Notificador notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
