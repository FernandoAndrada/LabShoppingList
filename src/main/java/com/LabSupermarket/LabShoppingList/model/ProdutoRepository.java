package com.LabSupermarket.LabShoppingList.model;

import com.LabSupermarket.LabShoppingList.Entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {


    Optional<Produto> findByNome(String nome);

    Optional<Produto> findByStatus(Boolean status);
}