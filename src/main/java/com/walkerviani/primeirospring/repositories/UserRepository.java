package com.walkerviani.primeirospring.repositories;

import com.walkerviani.primeirospring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
