package br.com.soulzenyogashala.soul.services;

import br.com.soulzenyogashala.soul.models.Usuario;
import br.com.soulzenyogashala.soul.repositories.UsuarioRepository;
import br.com.soulzenyogashala.soul.services.exceptions.NotFound;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario create(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario login(String email, String senha){
        return usuarioRepository.findByEmailAndSenha(email, senha).orElseThrow(()-> new NotFound("Dados Inválidos"));
    }

    public Usuario update(Usuario usuario){
        Optional<Usuario> usuarioUpdate = usuarioRepository.findByEmailAndSenhaAndId(usuario.getEmail(), usuario.getSenha(), usuario.getId());
        return usuarioUpdate.map(usuario1 -> usuarioRepository.save(new Usuario(usuario))).orElseThrow(()-> new NotFound("Erro ao atualizar"));
    }

    public void delete(Integer id, String email, String senha){
        Optional<Usuario> usuarioUpdate = usuarioRepository.findByEmailAndSenhaAndId(email, senha, id);
        usuarioUpdate.ifPresent(usuario -> usuarioRepository.deleteById(usuario.getId()));
    }
}
