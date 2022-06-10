package com.altamirofigueiredo.projetospringboot1.repositories;

import com.altamirofigueiredo.projetospringboot1.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
