package com.LabSupermarket.LabShoppingList.controller;

import com.LabSupermarket.LabShoppingList.Entity.Produto;
import com.LabSupermarket.LabShoppingList.Service.Interfaces.ProdutoService;
import com.LabSupermarket.LabShoppingList.model.ProdutoRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(this.produtoService.salvar(produto));
    }

    @PutMapping
    public ResponseEntity<Produto> atualizar(@RequestBody Produto produto){
        return ResponseEntity.ok(this.produtoService.atualizar(produto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscar(@PathVariable Long id){
        Produto produto = this.produtoService.buscar(id);

        if(produto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(this.produtoService.buscar(id));
    }

    @GetMapping("/buscar-por-nome")
    public ResponseEntity<Produto> buscarPorNome(@PathParam("nome") String nome){
        return ResponseEntity.ok(this.produtoService.buscarPorNome(nome));
    }

    @GetMapping("/buscar-por-status")

    public List<Produto> busccarPorStatus(@PathParam("status")Boolean status){

        return ResponseEntity.ok((this.produtoService.buscarPorStatus(status))).getBody();
    }

    @GetMapping
    public List<Produto> listar(){

        return ResponseEntity.ok((this.produtoService.listar())).getBody();
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<String> excluir(@PathVariable Long id) {
        this.produtoService.excluir(id);
        return ResponseEntity.ok("Excluido com sucesso!");
    }

    @GetMapping("/soma")
    public Float soma(){

        return ResponseEntity.ok((this.produtoRepository.sumValor())).getBody();
    }


}