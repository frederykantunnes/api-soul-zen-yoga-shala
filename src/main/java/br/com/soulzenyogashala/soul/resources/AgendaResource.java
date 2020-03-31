package br.com.soulzenyogashala.soul.resources;
import br.com.soulzenyogashala.soul.models.Agenda;
import br.com.soulzenyogashala.soul.services.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agenda")
public class AgendaResource {

    @Autowired
    AgendaService agendaService;


    /**
     *
     * @param agenda para salvar na base passando todos os parametros
     * @return evento de agenda salvo
     */
    @PostMapping()
    public ResponseEntity<Agenda> create(@RequestBody Agenda agenda){
        return ResponseEntity.ok().body(agendaService.create(agenda));
    }

    /**
     *
     * @return lista dos proximos eventos, incluindo hoje
     */
    @GetMapping()
    public ResponseEntity<List<Agenda>> getNext(){
        return ResponseEntity.ok().body(agendaService.getNext());
    }

    /**
     *
     * @return lista de todos os eventos
     */
    @GetMapping("/all")
    public ResponseEntity<List<Agenda>> getAll(){
        return ResponseEntity.ok().body(agendaService.getAll());
    }


    /**
     *
     * @param id para deletar registro
     * @return void
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        agendaService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
