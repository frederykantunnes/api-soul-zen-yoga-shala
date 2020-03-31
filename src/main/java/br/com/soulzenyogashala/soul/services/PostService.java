package br.com.soulzenyogashala.soul.services;

import br.com.soulzenyogashala.soul.models.Post;
import br.com.soulzenyogashala.soul.models.Usuario;
import br.com.soulzenyogashala.soul.repositories.PostRepository;
import br.com.soulzenyogashala.soul.repositories.UsuarioRepository;
import br.com.soulzenyogashala.soul.services.exceptions.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    public Post create(Post post){
        if (usuarioRepository.findById(post.getIdusuario()).get().getTipo() == 1){
            return postRepository.save(post);
        }else{
            return null;
        }
    }

    public List<Post> findAll(Integer pageNo, Integer pageSize){
        Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<Post> pagedResult = postRepository.findAll(paging);
        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<>();
        }
    }

    public void delete(Integer id){
        Optional<Post> postOptional = postRepository.findById(id);
        postOptional.ifPresent(post -> postRepository.deleteById(post.getId()));
    }
}
