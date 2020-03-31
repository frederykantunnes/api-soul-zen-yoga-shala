package br.com.soulzenyogashala.soul.resources;

import br.com.soulzenyogashala.soul.models.Usuario;
import br.com.soulzenyogashala.soul.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

    @Autowired
    UsuarioService usuarioService;

    /**
     *
     * @param usuario para criar usuario (parametros obrigatorios são: email,senha,tipo,nome,endereco,bairro,cidade,cep,telefone,nascimento)
     *                Criptografia MD5 deve ser realizado no front/app
     * @return usuario criado
     */
    @PostMapping()
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario){
        return ResponseEntity.ok().body(usuarioService.create(usuario));
    }


    /**
     *
     * @param email para validar junto a senha
     * @param senha para vaildar usuario junto com email
     * @return usuario caso encontre com o email e senha informados
     */
    @GetMapping("/{email}/{senha}")
    public ResponseEntity<Usuario> login(@PathVariable String email, @PathVariable String senha){
        return ResponseEntity.ok().body(usuarioService.login(email, senha));
    }

    /**
     *
     * @param id para buscar o item para atualizar
     * @param usuario será utilizado o email e senha para buscar junto com id
     * @return usuario atualizado
     */
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> update(@PathVariable Integer id, @RequestBody Usuario usuario){
        usuario.setId(id);
        return ResponseEntity.ok().body(usuarioService.update(usuario));
    }

    /**
     *
     * @param id para buscar registro
     * @param email para buscar registro
     * @param senha para confirmar que o usuário está deletando
     * @return void
     */
    @DeleteMapping("/{id}/{email}/{senha}")
    public ResponseEntity<Void> delete(@PathVariable Integer id, @PathVariable String email, @PathVariable String senha){
        usuarioService.delete(id, email, senha);
        return ResponseEntity.noContent().build();
    }
}
