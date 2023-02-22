package com.example.project9.repository;

import com.example.project9.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer>{

    // Jpa Naming 쿼리
    // SELECT * FROM user WHERE username = ?1 AND password = ?2;
    User findByUsernameAndPassword(String username, String password);
}
