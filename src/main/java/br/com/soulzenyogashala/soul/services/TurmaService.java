package br.com.soulzenyogashala.soul.services;

import br.com.soulzenyogashala.soul.models.Agenda;
import br.com.soulzenyogashala.soul.models.Turma;
import br.com.soulzenyogashala.soul.repositories.AgendaRepository;
import br.com.soulzenyogashala.soul.repositories.TurmaRepository;
import br.com.soulzenyogashala.soul.repositories.UsuarioRepository;
import br.com.soulzenyogashala.soul.services.exceptions.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TurmaService {

    @Autowired
   TurmaRepository turmaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Turma> findAll(){
        return turmaRepository.findAll();
    }

    public Turma findByCode(String code){
        Optional<Turma> turma =  turmaRepository.findByCodigodeacesso(code);
        return turma.orElse(null);
    }

    public Turma create(Turma turma){
        if (usuarioRepository.findById(turma.getIdusuario()).get().getTipo()==1){
            long unixTime = System.currentTimeMillis() / 1000L;
            turma.setCodigodeacesso(unixTime+"");
            return turmaRepository.save(turma);
        }
        return null;
    }

    public Turma update(Turma turma){
        if (usuarioRepository.findById(turma.getIdusuario()).get().getTipo()==1){
            Optional<Turma> turmaOptional = turmaRepository.findById(turma.getId());
            if(turmaOptional.isPresent()){
                turma.setCodigodeacesso(turmaOptional.get().getCodigodeacesso());
                return turmaOptional.map(turma1 -> turmaRepository.save(new Turma(turma))).orElseThrow(()-> new NotFound("Erro ao atualizar"));
            }else{
                return null;
            }
        }
        return null;
    }

    public void delete(int id){
        turmaRepository.deleteById(id);
    }
}
