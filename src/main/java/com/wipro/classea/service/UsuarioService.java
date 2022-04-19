package com.wipro.classea.service;

import com.wipro.classea.model.Usuario;
import com.wipro.classea.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;


    public Usuario findById(Integer id) {
        Optional<Usuario> obj = usuarioRepository.findById(id);
        return obj.orElse(null);
    }
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario update(Integer id, Usuario obj) {
        Usuario newObj = findById(id);
        newObj.setNome(obj.getNome());
        newObj.setSobrenome(obj.getSobrenome());
        newObj.setEmail(obj.getEmail());
        newObj.setSenha(obj.getSenha());
        return usuarioRepository.save(newObj);
    }
    public Usuario create(Usuario obj) {
        return usuarioRepository.save(obj);
    }
    public void delete(Integer id) {
        findById(id);
        usuarioRepository.deleteById(id);
    }

}
