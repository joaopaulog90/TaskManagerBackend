package com.dev.joao.paulo.task_manager.repository;

import com.dev.joao.paulo.task_manager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}