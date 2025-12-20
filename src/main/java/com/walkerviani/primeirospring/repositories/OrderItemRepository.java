package com.walkerviani.primeirospring.repositories;

import com.walkerviani.primeirospring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
