package com.example.demo1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo1.models.Categoria;
import com.example.demo1.models.Produto;
import com.example.demo1.repository.CategoriaRepository;
import com.example.demo1.repository.ProdutoRepository;

import java.util.Arrays;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(CategoriaRepository categoriaRepository, ProdutoRepository produtoRepository) {
        return args -> {
            System.out.println("*** INSERINDO CATEGORIA ***");
            Produto p1 = new Produto((long) 0, "Produto1", 2000, null);
            Produto p2 = new Produto((long) 0, "Produto2", 2100, null);
            p1 = produtoRepository.save(p1);
            p2 = produtoRepository.save(p2);

            Categoria c1 = new Categoria((long) 0, "Categoria1", Arrays.asList(p1, p2));
            c1 = categoriaRepository.save(c1);

            p1.setCategoriaProduto(c1);
            p2.setCategoriaProduto(c1);

            p1 = produtoRepository.save(p1);
            p2 = produtoRepository.save(p2);
        };
    }
}
