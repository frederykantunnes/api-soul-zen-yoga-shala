package br.com.soulzenyogashala.soul.repositories;

import br.com.soulzenyogashala.soul.models.Agenda;
import br.com.soulzenyogashala.soul.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Integer> {
    Optional<List<Agenda>> findByDataAfter(Date date);
}
