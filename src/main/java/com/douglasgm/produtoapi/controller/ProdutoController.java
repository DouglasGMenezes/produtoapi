package com.douglasgm.produtoapi.controller;

import com.douglasgm.produtoapi.model.Produto;
import com.douglasgm.produtoapi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(name = "produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto Recebido" + produto);
        produtoRepository.save(produto);

        return produto;
    }

}
