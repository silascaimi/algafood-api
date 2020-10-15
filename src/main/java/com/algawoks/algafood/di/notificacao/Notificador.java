package com.algawoks.algafood.di.notificacao;

import com.algawoks.algafood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}