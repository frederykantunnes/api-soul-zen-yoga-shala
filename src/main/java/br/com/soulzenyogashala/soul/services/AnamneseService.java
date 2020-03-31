package br.com.soulzenyogashala.soul.services;

import br.com.soulzenyogashala.soul.models.Anamnese;
import br.com.soulzenyogashala.soul.models.Usuario;
import br.com.soulzenyogashala.soul.repositories.AnamneseRepository;
import br.com.soulzenyogashala.soul.repositories.UsuarioRepository;
import br.com.soulzenyogashala.soul.services.exceptions.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnamneseService {

    @Autowired
    AnamneseRepository anamneseRepository;

    public Anamnese create(Anamnese anamnese){
        Optional<Anamnese> anamneseOptional = anamneseRepository.findByIdusuario(anamnese.getIdusuario());
        if (anamneseOptional.isPresent()){
            anamnese.setId(anamneseOptional.get().getId());
            return update(anamnese);
        }else {
            return anamneseRepository.save(anamnese);
        }
    }

    public Anamnese findByIdUser(int idusuario){
        Optional <Anamnese> anamneseOptional = anamneseRepository.findByIdusuario(idusuario);
        if (anamneseOptional.isPresent()){
            return anamneseOptional.get();
        }else {
            Anamnese anamnese = new Anamnese();
            anamnese.setIdusuario(idusuario);
            return create(anamnese);
        }
    }

    public Anamnese update(Anamnese anamnese){
        Optional<Anamnese> anamneseOptional = anamneseRepository.findById(anamnese.getId());
        return anamneseOptional.map(anamnese1 -> anamneseRepository.save(new Anamnese(anamnese))).orElseThrow(()-> new NotFound("Erro ao atualizar"));
    }

    public void delete(Integer idusuario){
        Optional<Anamnese> anamneseOptional = anamneseRepository.findByIdusuario(idusuario);
        anamneseOptional.ifPresent(anamnese -> anamneseRepository.deleteById(anamnese.getId()));
    }
}
