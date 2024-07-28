package com.onuroztas.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.onuroztas.expensetracker.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}