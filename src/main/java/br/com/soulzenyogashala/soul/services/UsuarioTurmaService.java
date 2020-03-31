package br.com.soulzenyogashala.soul.services;

import br.com.soulzenyogashala.soul.models.Turma;
import br.com.soulzenyogashala.soul.models.Usuario;
import br.com.soulzenyogashala.soul.repositories.TurmaRepository;
import br.com.soulzenyogashala.soul.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioTurmaService {

    @Autowired
    TurmaRepository turmaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;


    public List<Usuario> findAllByTurma(String turma){
        Optional<List<Usuario>> usuarios =  usuarioRepository.findAllByTurma(turma);
        if (usuarios.isPresent()){
            List<Usuario> usuarioList = usuarios.get();
            for(int i=0; i<usuarioList.size(); i++){
                usuarioList.get(i).setSenha(null);
            }
        return usuarioList;
        }
        return null;
    }

    public Turma loginTurma(String turma, int usuario){
        Optional<Usuario> usuario1 = usuarioRepository.findById(usuario);
        Optional<Turma> turma1 = turmaRepository.findByCodigodeacesso(turma);

        if(usuario1.isPresent() && turma1.isPresent()){
            Usuario usuarioUpdate = usuario1.get();
            usuarioUpdate.setTurma(turma+"");
            usuario1.map(usuario2 -> usuarioRepository.save(usuarioUpdate));
            return turma1.get();
        }else{
            return null;
        }
    }

    public void logoutTurma(String turma, int usuario){
        Optional<Usuario> usuario1 = usuarioRepository.findById(usuario);
        Optional<Turma> turma1 = turmaRepository.findByCodigodeacesso(turma);
        if(usuario1.isPresent() && turma1.isPresent()){
            Usuario usuarioUpdate = usuario1.get();
            usuarioUpdate.setTurma(null);
            usuario1.map(usuario2 -> usuarioRepository.save(usuarioUpdate));
        }
    }
}
