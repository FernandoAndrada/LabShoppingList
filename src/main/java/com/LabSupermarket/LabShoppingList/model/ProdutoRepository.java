package com.LabSupermarket.LabShoppingList.model;

import com.LabSupermarket.LabShoppingList.Entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Query(value = "SELECT sum(valor) FROM Produto", nativeQuery = true)
    Float sumValor();

    Optional<Produto> findByNome(String nome);

    List<Produto> findByStatus(Boolean status);
}