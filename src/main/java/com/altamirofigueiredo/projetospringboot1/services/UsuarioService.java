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

    public  Usuario insert(Usuario obj){
        return  repository.save(obj);
    }

    public  void  delete(Long id){
        repository.deleteById(id);
    }

    public  Usuario update(Long id, Usuario obj){
        Usuario entity = repository.getOne(id);
        updateData(entity, obj);
        return  repository.save(entity);
    }

    private void updateData(Usuario entity, Usuario obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

}
