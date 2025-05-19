package br.com.senai.api.controllers;

import br.com.senai.api.models.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    //lista com todos os clientes
    @GetMapping
    public List<Cliente> listar(){
        return service.listarTodos();
    }
    //encontrar um cliente pelo seu id
    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }
    //salvar um cliente
    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente){
        return service.salvar(cliente);
    }
    //atualizar um cliente
    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id,
                             @RequestBody Cliente cliente){
        cliente.setId(id);
        return service.atualizar(cliente);
    }
    //deletar um cliente
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }

}
