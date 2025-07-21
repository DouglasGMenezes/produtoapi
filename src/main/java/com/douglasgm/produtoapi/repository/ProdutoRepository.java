package com.douglasgm.produtoapi.repository;

import com.douglasgm.produtoapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
    List<Produto> findByNomeContainingIgnoreCase(String nome);
}
