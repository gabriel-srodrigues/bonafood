package br.com.bonafood.domain.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.bonafood.domain.model.Usuario;

@Repository
public interface UsuarioRepository extends CustomJpaRepository<Usuario, Long> {

	Optional<Usuario> findByEmail(String email);
	
}
