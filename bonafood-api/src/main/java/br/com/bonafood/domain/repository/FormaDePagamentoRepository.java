package br.com.bonafood.domain.repository;

import java.util.List;

import br.com.bonafood.domain.model.FormaDePagamento;

public interface FormaDePagamentoRepository {

	List<FormaDePagamento> listar();
	FormaDePagamento buscar(Long id);
	FormaDePagamento salvar(FormaDePagamento formaPagamento);
	void remover(FormaDePagamento formaPagamento);
	
}
