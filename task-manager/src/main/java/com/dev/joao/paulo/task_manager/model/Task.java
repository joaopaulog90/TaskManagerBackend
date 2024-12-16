package com.dev.joao.paulo.task_manager.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Task {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "Título da tarefa é obrigatório.")
    private String title;
    
    private String description;
    
    private boolean completed = false;
    
    private LocalDateTime createdAt = LocalDateTime.now();
}