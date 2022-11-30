package com.LabSupermarket.LabShoppingList.Service;


import com.LabSupermarket.LabShoppingList.Entity.Produto;
import com.LabSupermarket.LabShoppingList.Service.Interfaces.ProdutoService;
import com.LabSupermarket.LabShoppingList.model.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Produto salvar(Produto produto) {
        Optional<Produto> produtoSalva = this.produtoRepository.findByNome(produto.getNome());
        if(produtoSalva.isPresent()){
            throw new EntityNotFoundException("Este Produto já existe!");
        }


        return this.produtoRepository.save(produto);
    }

    @Override
    public Produto atualizar(Produto produto) {
        Optional<Produto> produtoPesquisado = this.produtoRepository.findById(produto.getId());

        if(produtoPesquisado.isPresent()) {
            produtoPesquisado.get().setNome(produto.getNome());
            //BeanUtils.copyProperties(produto, produtoPesquisada.get(),"id","status");
            return this.produtoRepository.save(produtoPesquisado.get());
        }
        return null;
    }

    @Override
    public Produto buscar(Long id) {
        Optional<Produto> produto = this.produtoRepository.findById(id);

        if(Produto.isPresent()){
            return produto.get();
        }
        return null;
    }

    @Override
    public Produto buscarPorNome(String nome) {
        return this.produtoRepository.findByNome(nome).orElseThrow(() -> {
            throw new EntityNotFoundException("Não foi possível encontrar um produto com o nome: " + nome);
        });
    }

    @Override
    public List<Produto> listar() {
        return this.produtoRepository.findAll();
    }

    @Override
    public void excluir(Long id) {
        this.produtoRepository.deleteById(id);
    }

//    @Override
//    public Produto buscarPorStatus(Boolean status) {
//        return this.produtoRepository.findByStatus(status).orElseThrow(() -> {
//            throw new EntityNotFoundException("Não foi possível encontrar um produto com o status: " + status);
//        });
//    }
    @Override
    public List<Produto> buscarPorStatus(Boolean status){
        return this.produtoRepository.findByStatus(status);
        }
}