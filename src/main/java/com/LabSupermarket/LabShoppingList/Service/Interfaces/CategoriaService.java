package com.LabSupermarket.LabShoppingList.Service.Interfaces;

import com.LabSupermarket.LabShoppingList.Entity.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoriaService {


    Categoria salvar(Categoria categoria);

    Categoria atualizar(Categoria categoria);

    Categoria buscar(Long id);

    Categoria buscarPorNome(String nome);

    List<Categoria> listar();

    void excluir(Long id);
}
