package com.altamirofigueiredo.projetospringboot1.services;

import com.altamirofigueiredo.projetospringboot1.entities.Usuario;
import com.altamirofigueiredo.projetospringboot1.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findAll(){
        return  repository.findAll();
    }
    public  Usuario findById(Long id) {
        Optional<Usuario> obj = repository.findById(id);
        return obj.get();
    }

}
