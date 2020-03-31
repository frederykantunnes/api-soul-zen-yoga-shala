package br.com.soulzenyogashala.soul.resources;
import br.com.soulzenyogashala.soul.models.Post;
import br.com.soulzenyogashala.soul.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostResource {

    @Autowired
    PostService postService;

    /**
     *
     * @param post para inserir na base, só insere se o usuario que está postando for tipo 1 (administrador)
     * @return post inserido
     */
    @PostMapping()
    public ResponseEntity<Post> create(@RequestBody Post post){
        return ResponseEntity.ok().body(postService.create(post));
    }

    /**
     *
     * @param page é o numero da pagina
     * @param size é quantidade de itens por paginação
     * @return lista de posts
     */
    @GetMapping("{page}/{size}")
    public ResponseEntity<List<Post>> getAll(@PathVariable Integer page, @PathVariable Integer size){
        return ResponseEntity.ok().body(postService.findAll(page, size));
    }

    /**
     *
     * @param id para buscar e deletar pelo id
     * @return void
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        postService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
