package br.com.soulzenyogashala.soul.repositories;

import br.com.soulzenyogashala.soul.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}
