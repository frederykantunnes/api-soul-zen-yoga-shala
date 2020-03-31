package br.com.soulzenyogashala.soul.repositories;

import br.com.soulzenyogashala.soul.models.Agenda;
import br.com.soulzenyogashala.soul.models.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer> {
    Optional<Turma> findByCodigodeacesso(String code);
}
