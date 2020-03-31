package br.com.soulzenyogashala.soul.resources;

import br.com.soulzenyogashala.soul.models.Anamnese;
import br.com.soulzenyogashala.soul.services.AnamneseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/anamnese/{idusuario}")
public class AnamneseResource {

    @Autowired
    AnamneseService anamneseService;

    /**
     *
     * @param anamnese para salvar na base, todos os dados podem ser nulos, tratamento deve ser no front
     * @param idusuario para vincular a anamnese ao usuario correto
     * @return anamnese inserida
     */
    @PostMapping()
    public ResponseEntity<Anamnese> create(@RequestBody Anamnese anamnese, @PathVariable Integer idusuario){
        anamnese.setIdusuario(idusuario);
        return ResponseEntity.ok().body(anamneseService.create(anamnese));
    }


    /**
     *
     * @param idusuario  para buscar a anamnese do usuario correto
     * @return anamnese do usuario, e caso nao tenha nenhuma, é criado uma com os dados nulos
     */
    @GetMapping()
    public ResponseEntity<Anamnese> findByIdUser(@PathVariable Integer idusuario){
        return ResponseEntity.ok().body(anamneseService.findByIdUser(idusuario));
    }


    /**
     *
     * @param idusuario para vincular a anamnese ao usuario correto
     * @param anamnese completa com os dados que serão alterados e não
     * @return anamnese atualizada
     */
    @PutMapping()
    public ResponseEntity<Anamnese> update(@PathVariable Integer idusuario, @RequestBody Anamnese anamnese){
        anamnese.setIdusuario(idusuario);
        return ResponseEntity.ok().body(anamneseService.create(anamnese));
    }

    /**
     *
     * @param idusuario  para deletar a anamnese do usuario correto
     * @return void
     */
    @DeleteMapping()
    public ResponseEntity<Void> delete(@PathVariable Integer idusuario){
        anamneseService.delete(idusuario);
        return ResponseEntity.noContent().build();
    }
}
