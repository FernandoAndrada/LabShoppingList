package com.LabSupermarket.LabShoppingList.Service.Interfaces;

import com.LabSupermarket.LabShoppingList.Entity.Produto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProdutoService {


    Produto salvar(Produto produto);

    Produto atualizar(Produto produto);

    Produto buscar(Long id);

    Produto buscarPorNome(String nome);

    List<Produto> listar();

    void excluir(Long id);

    //Produto buscarPorStatus(Boolean status);


    //    @Override
    //    public Produto buscarPorStatus(Boolean status) {
    //        return this.produtoRepository.findByStatus(status).orElseThrow(() -> {
    //            throw new EntityNotFoundException("Não foi possível encontrar um produto com o status: " + status);
    //        });
    //    }


    //    @Override
    //    public Produto buscarPorStatus(Boolean status) {
    //        return this.produtoRepository.findByStatus(status).orElseThrow(() -> {
    //            throw new EntityNotFoundException("Não foi possível encontrar um produto com o status: " + status);
    //        });
    //    }
    List<Produto> buscarPorStatus(Boolean status);
}