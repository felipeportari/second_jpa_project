package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
