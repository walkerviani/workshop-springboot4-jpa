package com.walkerviani.primeirospring.repositories;

import com.walkerviani.primeirospring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
