package com.varejo.gestaoInventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.varejo.gestaoInventario.model.Produto;
import com.varejo.gestaoInventario.repository.GestaoInventarioRepository;

@Service
public class GestaoInventarioService {

    @Autowired
    private GestaoInventarioRepository repository;

    public List<Produto> getAll() {
        return repository.listAll();
    }

    public Produto getById(Long id) {
        return repository.findById(id);
    }

    @Transactional
    public Produto create(Produto produto) {
        if (produto == null || produto.getId() != null) {

            return null;
        }
        repository.persist(produto);
        return produto;
    }

    @Transactional
    public Produto update(Long id, Produto produtoAtualizado) {
        if (produtoAtualizado == null) {
            return null;
        }
        Produto produtoExistente = repository.findById(id);
        if (produtoExistente != null) {
            produtoExistente.setNome(produtoAtualizado.getNome());
            produtoExistente.setEstoque(produtoAtualizado.getEstoque());
            produtoExistente.setDescricao(produtoAtualizado.getDescricao());
            repository.update(produtoExistente);
            return produtoExistente;
        }
        return null;
    }


    @Transactional
    public Produto atualizarEstoque(Long produtoId, int quantidade) {
        Produto produto = repository.findById(produtoId);
        if (produto != null) {
            produto.setEstoque(produto.getEstoque() + quantidade);
            repository.update(produto);
            return produto;
        }
        return null;
    }

    public boolean notificarEstoqueMinimo(Long produtoId) {
        return repository.isBelowStockThreshold(produtoId, 10);
    }
}

