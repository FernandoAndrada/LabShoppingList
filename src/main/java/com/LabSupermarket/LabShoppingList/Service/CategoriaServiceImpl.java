package com.LabSupermarket.LabShoppingList.Service;

import com.LabSupermarket.LabShoppingList.Entity.Categoria;
import com.LabSupermarket.LabShoppingList.Entity.Produto;
import com.LabSupermarket.LabShoppingList.Service.Interfaces.CategoriaService;
import com.LabSupermarket.LabShoppingList.model.CategoriaRepository;
import com.LabSupermarket.LabShoppingList.model.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

//    @Autowired
//    private Produto produto;

    @Override
    public Categoria salvar(Categoria categoria) {
        Optional<Categoria> categoriaSalva = this.categoriaRepository.findByNome(categoria.getNome());
        if(categoriaSalva.isPresent()){
            throw new EntityNotFoundException("Esta Categoria já existe!");
        }
        return this.categoriaRepository.save(categoria);
    }

    @Override
    public Categoria atualizar(Categoria categoria) {
        Optional<Categoria> categoriaPesquisado = this.categoriaRepository.findById(categoria.getId());

        if(categoriaPesquisado.isPresent()) {
            categoriaPesquisado.get().setNome(categoria.getNome());
            return this.categoriaRepository.save(categoriaPesquisado.get());
        }
        return null;
    }

    @Override
    public Categoria buscar(Long id) {
        Optional<Categoria> categoria = this.categoriaRepository.findById(id);

        if(Categoria.isPresent()){
            return categoria.get();
        }
        return null;
    }

    @Override
    public Categoria buscarPorNome(String nome) {
        return this.categoriaRepository.findByNome(nome).orElseThrow(() -> {
            throw new EntityNotFoundException("Não foi possível encontrar um categoria com o nome: " + nome);
        });
    }

    @Override
    public List<Categoria> listar() {
        return this.categoriaRepository.findAll();
    }

    @Override
    public void excluir(Long id) {
        Optional<Categoria> categoria = this.categoriaRepository.findById(id);
        if (categoria.isPresent()) {

            this.categoriaRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Esta Categoria está em uso e não pode ser deletada!");
        }
    }
}
