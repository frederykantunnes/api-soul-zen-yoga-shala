package br.com.soulzenyogashala.soul.services;

import br.com.soulzenyogashala.soul.models.Exercicio;
import br.com.soulzenyogashala.soul.models.ExercicioTurma;
import br.com.soulzenyogashala.soul.repositories.ExercicioRepository;
import br.com.soulzenyogashala.soul.repositories.ExercicioTurmaRepository;
import br.com.soulzenyogashala.soul.services.exceptions.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ExercicioService {


    @Autowired
    ExercicioRepository exercicioRepository;

    @Autowired
    ExercicioTurmaRepository exercicioTurmaRepository;

    public List<Exercicio> findAll(){
        return exercicioRepository.findAll();
    }

    public Exercicio findById(int id){
        Optional<Exercicio> exercicio =  exercicioRepository.findById(id);
        return exercicio.orElse(null);
    }

    public Exercicio create(Exercicio exercicio){
        return exercicioRepository.save(exercicio);
    }

    public  Exercicio update(Exercicio exercicio){
        Optional<Exercicio> exercicioOptional = exercicioRepository.findById(exercicio.getId());
        if (exercicioOptional.isPresent()){
            return exercicioOptional.map(exercicio1 -> exercicioRepository.save(new Exercicio(exercicio))).orElseThrow(()-> new NotFound("Erro na atualização"));
        }
        return null;
    }

    public void delete(int id){
        exercicioTurmaRepository.deleteAllByIdturma(id);
        exercicioRepository.deleteById(id);
    }



    // OPERAÇÕES COM A TURMA
    public List<Exercicio> findAllByTurma(int idTurma){
        Optional<List<ExercicioTurma>> exercicioTurma = exercicioTurmaRepository.findAllByIdturma(idTurma);
        List<Exercicio> list = new ArrayList<>();
        if (exercicioTurma.isPresent()){
            List<ExercicioTurma> listaET = exercicioTurma.get();
            for (int i=0; i<listaET.size(); i++){
                list.add(exercicioRepository.findById(listaET.get(i).getIdexercicio()).get());
            }
            return list;
        }
        return list;
    }

    public ExercicioTurma insertOnTurma(ExercicioTurma exercicioTurma){
        return exercicioTurmaRepository.save(exercicioTurma);
    }


    public void deleteOnTurmaById(int id){
        exercicioTurmaRepository.deleteById(id);
    }

}
