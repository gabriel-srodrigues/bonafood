package br.com.bonafood.domain.repository;

import java.util.List;

import br.com.bonafood.domain.model.Estado;

public interface EstadoRepository {

	List<Estado> listar();
	Estado buscar(Long id);
	Estado salvar(Estado estado);
	void remover(Long id);
	
}