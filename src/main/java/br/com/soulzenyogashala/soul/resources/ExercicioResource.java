package br.com.soulzenyogashala.soul.resources;

import br.com.soulzenyogashala.soul.models.Exercicio;
import br.com.soulzenyogashala.soul.models.ExercicioTurma;
import br.com.soulzenyogashala.soul.services.ExercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercicio")
public class ExercicioResource {


    @Autowired
    ExercicioService exercicioService;

    /**
     *
     * @return lista de todos os exercicios cadastrados no sistema
     */
    @GetMapping()
    public ResponseEntity<List<Exercicio>> findAll(){
        return ResponseEntity.ok().body(exercicioService.findAll());
    }

    /**
     *
     * @param id para buscar pelo id
     * @return Exercicio buscado pelo id passado na url
     */
    @GetMapping("/{id}")
    public ResponseEntity<Exercicio> findById(@PathVariable int id){
        return ResponseEntity.ok().body(exercicioService.findById(id));
    }

    /**
     *
     * @param exercicio é o novo exercicio para ser salvo na base
     * @return
     */
    @PostMapping
    public ResponseEntity<Exercicio> create(@RequestBody Exercicio exercicio){
        return ResponseEntity.ok().body(exercicioService.create(exercicio));
    }


    /**
     *
     * @param exercicio é o exercício que sera atualizado na base de dados
     * @param id para busca do registro a ser alterado
     * @return exercicio alterado
     */
    @PutMapping("/{id}")
    public ResponseEntity<Exercicio> update(@RequestBody Exercicio exercicio, @PathVariable int id){
        exercicio.setId(id);
        return ResponseEntity.ok().body(exercicioService.update(exercicio));
    }

    /**
     *
     * @param id para buscar o registro e deletar
     * @return void
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        exercicioService.delete(id);
        return ResponseEntity.noContent().build();
    }

    //////////////// endpoint de Exercício Turma

    /**
     *
     * @param id para busrcar todos os exercícios da turma desse id
     * @return lista de exercicios da turma
     */
    @GetMapping("/turma/{id}")
    public ResponseEntity<List<Exercicio>> findAllByTurma(@PathVariable int id){
        return ResponseEntity.ok().body(exercicioService.findAllByTurma(id));
    }

    /**
     *
     * @param exercicioTurma id do exercicio e da turma para criar vinculo entre as entidades
     * @return o elemento inserido
     */
    @PostMapping("/turma")
    public ResponseEntity<ExercicioTurma> insertExercicioTurma(@RequestBody ExercicioTurma exercicioTurma){
        return ResponseEntity.ok().body(exercicioService.insertOnTurma(exercicioTurma));
    }

    /**
     *
     * @param id para buscar registro e deletar
     * @return void
     */
    @DeleteMapping("/turma/{id}")
    public ResponseEntity<Void> deleteByTurma(@PathVariable int id){
        exercicioService.deleteOnTurmaById(id);
        return ResponseEntity.noContent().build();
    }

}
