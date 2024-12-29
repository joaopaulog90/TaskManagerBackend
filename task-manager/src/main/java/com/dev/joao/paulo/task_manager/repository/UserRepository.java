package com.dev.joao.paulo.task_manager.repository;

import com.dev.joao.paulo.task_manager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}