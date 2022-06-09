package com.altamirofigueiredo.projetospringboot1.repositories;

import com.altamirofigueiredo.projetospringboot1.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
