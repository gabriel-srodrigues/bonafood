package br.com.bonafood.domain.exception;

public class PedidoNaoEncontradoException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 1L;
	
	public PedidoNaoEncontradoException(Long pedidoId) {
		this(String.format("Não existe um pedido com código %d", pedidoId));
	}

	public PedidoNaoEncontradoException(String codigoPedido) {
		super(String.format("Não existe um pedido com código %s", codigoPedido));
	}

}
