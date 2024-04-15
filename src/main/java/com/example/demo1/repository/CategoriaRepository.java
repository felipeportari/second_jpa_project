package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo1.models.Categoria;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    List<Categoria> findByNomeStartingWith(String nome);

    @Query("SELECT c FROM Categoria c LEFT JOIN FETCH c.produtos WHERE c.id = :id")
    Categoria findByIdAndFetchProdutosEagerly(@Param("id") Long id);
}
