package com.LabSupermarket.LabShoppingList.controller;


import com.LabSupermarket.LabShoppingList.Entity.Categoria;
import com.LabSupermarket.LabShoppingList.Service.Interfaces.CategoriaService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<Categoria> salvar(@RequestBody Categoria categoria) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(this.categoriaService.salvar(categoria));
    }

    @PutMapping
    public ResponseEntity<Categoria> atualizar(@RequestBody Categoria categoria){
        return ResponseEntity.ok(this.categoriaService.atualizar(categoria));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscar(@PathVariable Long id){
        Categoria categoria = this.categoriaService.buscar(id);

        if(categoria == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(this.categoriaService.buscar(id));
    }

    @GetMapping("/buscar-por-nome")
    public ResponseEntity<Categoria> buscarPorNome(@PathParam("nome") String nome){
        return ResponseEntity.ok(this.categoriaService.buscarPorNome(nome));
    }

    @GetMapping
    public List<Categoria> listar(){

        return ResponseEntity.ok((this.categoriaService.listar())).getBody();
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<String> excluir(@PathVariable Long id) {
        this.categoriaService.excluir(id);
        return ResponseEntity.ok("Excluido com sucesso!");
    }


}