package br.com.soulzenyogashala.soul.repositories;

import br.com.soulzenyogashala.soul.models.ExercicioTurma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ExercicioTurmaRepository extends JpaRepository<ExercicioTurma, Integer> {
    Optional<List<ExercicioTurma>> findAllByIdturma(int idturma);
    Optional<Void> deleteByIdturmaAndIdexercicio(int idturma, int idexercicio);
    Optional<Void> deleteAllByIdturma(int idturma);
}
