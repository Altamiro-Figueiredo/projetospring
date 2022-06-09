package com.altamirofigueiredo.projetospringboot1.resources;

import com.altamirofigueiredo.projetospringboot1.entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UsuarioResources {
    @GetMapping
    public ResponseEntity<Usuario> findAll(){
        Usuario u = new Usuario(1L, "Maria", "maria@gmail.com", "666666", "12345" );
        return ResponseEntity.ok().body(u);
    }
}