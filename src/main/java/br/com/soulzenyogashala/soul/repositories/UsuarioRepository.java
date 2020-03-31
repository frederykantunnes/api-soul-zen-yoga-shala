package br.com.soulzenyogashala.soul.repositories;

import br.com.soulzenyogashala.soul.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByEmailAndSenha(String email, String senha);
    Optional<Usuario> findByEmailAndSenhaAndId(String email, String senha, Integer id);
    Optional<List<Usuario>> findAllByTurma(String id);
}
