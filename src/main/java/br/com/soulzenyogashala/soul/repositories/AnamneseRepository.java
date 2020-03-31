package br.com.soulzenyogashala.soul.repositories;

import br.com.soulzenyogashala.soul.models.Anamnese;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnamneseRepository extends JpaRepository<Anamnese, Integer> {
    Optional<Anamnese> findByIdusuario(Integer id);
}
