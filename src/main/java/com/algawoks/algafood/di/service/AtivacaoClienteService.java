package com.algawoks.algafood.di.service;

import com.algawoks.algafood.di.modelo.Cliente;
import com.algawoks.algafood.di.notificacao.NotificadorEmail;

public class AtivacaoClienteService {
	
	private NotificadorEmail notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
