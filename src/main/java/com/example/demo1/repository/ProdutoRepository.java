package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo1.models.Produto;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByPrecoGreaterThan(Double valor);

    List<Produto> findByPrecoLessThanEqual(Double valor);

    List<Produto> findByNomeStartingWith(String nome);
}
