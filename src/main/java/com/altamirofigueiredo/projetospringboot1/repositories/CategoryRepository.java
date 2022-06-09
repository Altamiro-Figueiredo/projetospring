package com.altamirofigueiredo.projetospringboot1.repositories;

import com.altamirofigueiredo.projetospringboot1.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
