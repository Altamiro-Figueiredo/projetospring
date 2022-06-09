package com.altamirofigueiredo.projetospringboot1.repositories;

import com.altamirofigueiredo.projetospringboot1.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
