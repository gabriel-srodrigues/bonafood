package br.com.bonafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.bonafood.domain.model.FormaDePagamento;
import br.com.bonafood.domain.repository.FormaDePagamentoRepository;

@Component
public class FormaDePagamentoRepositoryImpl implements FormaDePagamentoRepository {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<FormaDePagamento> listar() {
		return manager.createQuery("from FormaDePagamento", FormaDePagamento.class)
				.getResultList();
	}
	
	@Override
	public FormaDePagamento buscar(Long id) {
		return manager.find(FormaDePagamento.class, id);
	}
	
	@Transactional
	@Override
	public FormaDePagamento salvar(FormaDePagamento FormaDePagamento) {
		return manager.merge(FormaDePagamento);
	}
	
	@Transactional
	@Override
	public void remover(FormaDePagamento FormaDePagamento) {
		FormaDePagamento = buscar(FormaDePagamento.getId());
		manager.remove(FormaDePagamento);
	}

}
