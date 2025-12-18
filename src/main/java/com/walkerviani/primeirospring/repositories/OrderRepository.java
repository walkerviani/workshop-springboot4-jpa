package com.walkerviani.primeirospring.repositories;

import com.walkerviani.primeirospring.entities.Order;
import com.walkerviani.primeirospring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
