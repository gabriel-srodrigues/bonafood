package br.com.bonafood.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bonafood.domain.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
