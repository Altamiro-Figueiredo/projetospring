package com.altamirofigueiredo.projetospringboot1.repositories;

import com.altamirofigueiredo.projetospringboot1.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
