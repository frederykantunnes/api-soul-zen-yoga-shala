package br.com.soulzenyogashala.soul.services;

import br.com.soulzenyogashala.soul.models.Agenda;
import br.com.soulzenyogashala.soul.models.Post;
import br.com.soulzenyogashala.soul.repositories.AgendaRepository;
import br.com.soulzenyogashala.soul.repositories.PostRepository;
import br.com.soulzenyogashala.soul.repositories.UsuarioRepository;
import br.com.soulzenyogashala.soul.services.exceptions.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AgendaService {

    @Autowired
    AgendaRepository agendaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Agenda> getAll(){
        return agendaRepository.findAll();
    }

    public List<Agenda> getNext(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_MONTH, -1);
        Optional<List<Agenda>> list = agendaRepository.findByDataAfter(cal.getTime());
        return list.orElse(null);
    }

    public Agenda findById(int id){
        Optional<Agenda> agendaOptional =  agendaRepository.findById(id);
        return agendaOptional.orElse(null);
    }

    public void delete(int id){
        agendaRepository.deleteById(id);
    }

    public  Agenda create(Agenda agenda){
        if (usuarioRepository.findById(agenda.getIdusuario()).get().getTipo() == 1){
            return agendaRepository.save(agenda);
        }else{
            return null;
        }
    }

    public Agenda update(Agenda agenda){
        Optional<Agenda> agendaOptional = agendaRepository.findById(agenda.getId());
        return agendaOptional.map(agenda1 -> agendaRepository.save(new Agenda(agenda))).orElseThrow(()->new NotFound("Erro ao atualizar"));
    }

}
