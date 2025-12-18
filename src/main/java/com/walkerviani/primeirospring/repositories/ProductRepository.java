package com.walkerviani.primeirospring.repositories;

import com.walkerviani.primeirospring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
