package br.com.soulzenyogashala.soul.resources;
import br.com.soulzenyogashala.soul.models.Post;
import br.com.soulzenyogashala.soul.models.Turma;
import br.com.soulzenyogashala.soul.models.Usuario;
import br.com.soulzenyogashala.soul.services.PostService;
import br.com.soulzenyogashala.soul.services.TurmaService;
import br.com.soulzenyogashala.soul.services.UsuarioTurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import java.util.List;

@RestController
@RequestMapping("/turma")
public class TurmaResource {

    @Autowired
    TurmaService turmaService;

    @Autowired
    UsuarioTurmaService usuarioTurmaService;

    /**
     *
     * @param turma para salvar na base de dados
     * @return turma inserida com o codigo de acesso gerado
     */
    @PostMapping()
    public ResponseEntity<Turma> create(@RequestBody Turma turma){
        return ResponseEntity.ok().body(turmaService.create(turma));
    }


    /**
     *
     * @return lista com todas as turmas
     */
    @GetMapping()
    public ResponseEntity<List<Turma>> getAll(){
        return ResponseEntity.ok().body(turmaService.findAll());
    }

    /**
     *
     * @param code codigo da turma para buscar e entrar no grupo
     * @return turma buscada pelo código
     */
    @GetMapping("/{code}")
    public ResponseEntity<Turma> getByCode(@PathVariable String code){
        return ResponseEntity.ok().body(turmaService.findByCode(code));
    }

    /**
     *
     * @param code para buscar usuarios da turma específica
     * @return lista de usuarios
     */
    @GetMapping("/{code}/usuarios")
    public ResponseEntity<List<Usuario>> findAllByTurma(@PathVariable String code){
        return ResponseEntity.ok().body(usuarioTurmaService.findAllByTurma(code));
    }


    /**
     *
     * @param turma codigo de acesso da turma para entrar
     * @param usuario id de usuario que está entrando
     * @return turma que ingressou
     */
    @GetMapping("{turma}/login/{usuario}")
    public ResponseEntity<Turma> loginTurma(@PathVariable String turma, @PathVariable int usuario){
        return ResponseEntity.ok().body(usuarioTurmaService.loginTurma(turma, usuario));
    }

    /**
     *
     * @param turma codigo de acesso para confirmar que esta saindo do grupo correto
     * @param usuario is de usuario para sari do grupo
     * @return void
     */
    @GetMapping("{turma}/logout/{usuario}")
    public ResponseEntity<Void> logoutTurma(@PathVariable String turma, @PathVariable int usuario){
        usuarioTurmaService.logoutTurma(turma, usuario);
        return ResponseEntity.noContent().build();
    }

    /**
     *
     * @param id para buscar a turma a se atualizar na base
     * @param turma turma com os dados novos para atualizacao
     * @return turma atualizada
     */
    @PutMapping("/{id}")
    public ResponseEntity<Turma> update(@PathVariable Integer id, @RequestBody Turma turma){
        turma.setId(id);
        return ResponseEntity.ok().body(turmaService.update(turma));
    }


    /**
     *
     * @param id para buscar do registro a ser deletado
     * @return void
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        turmaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
