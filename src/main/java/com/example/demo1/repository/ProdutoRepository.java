package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}