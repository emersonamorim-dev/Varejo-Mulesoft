package com.varejo.gestaoInventario.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.varejo.gestaoInventario.model.Produto;

public class GestaoInventarioRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Produto> listAll() {
        return em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
    }

    public Produto findById(Long id) {
        return em.find(Produto.class, id);
    }

    public Produto findByName(String nome) {
        return em.createQuery("SELECT p FROM Produto p WHERE p.nome = :nome", Produto.class)
                 .setParameter("nome", nome)
                 .getSingleResult();
    }

    public void persist(Produto produto) {
        em.persist(produto);
    }

    public Produto update(Produto produto) {
        return em.merge(produto);
    }

    public void delete(Produto produto) {
        if (em.contains(produto)) {
            em.remove(produto);
        } else {
            em.remove(em.merge(produto));
        }
    }



    public boolean isBelowStockThreshold(Long id, int threshold) {
        Produto produto = em.createQuery("SELECT p FROM Produto p WHERE p.id = :id AND p.estoque < :threshold", Produto.class)
                             .setParameter("id", id)
                             .setParameter("threshold", threshold)
                             .getSingleResult();
        return produto != null;
    }
}
