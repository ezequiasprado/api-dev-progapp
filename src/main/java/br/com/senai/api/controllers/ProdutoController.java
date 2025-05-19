package br.com.senai.api.controllers;

import br.com.senai.api.models.Produto;
import br.com.senai.api.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // métodos http de comunicação
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService service;
    //lista com todos os produtos do restaurante
    @GetMapping  //     /produtos
    public List<Produto> listar(){
        return service.listarTodos();
    }
    //Encontrar um produto pelo seu id
    @GetMapping("/{id}") //      /produtos/1
    public Produto buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }
    //Salvar um produto
    @PostMapping // para receber dados usamos @RequestBody
    public Produto salvar(@RequestBody Produto produto){
        return service.salvar(produto);
    }
    //Alterar um produto
    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id,
                             @RequestBody Produto produto){
        produto.setId(id);
        return service.atualizar(produto);
    }
    //deletar um produto
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
