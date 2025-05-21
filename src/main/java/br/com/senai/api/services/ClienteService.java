package br.com.senai.api.services;

import br.com.senai.api.models.Cliente;
import br.com.senai.api.repositorys.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;
    //listar todos clientes
    public List<Cliente> listarTodos(){
        return repository.findAll();
    }
    //procurar um cliente pelo Id
    public Cliente buscarPorId(long id){
        return repository.findById(id).orElse(null);
    }
    //salvar um cliente no banco de dados
    public Cliente salvar(Cliente cliente){
        return repository.save(cliente);
    }
    //atualizar os dados do cliente
    public Cliente atualizar(Cliente cliente){
        return repository.save(cliente);
    }
    //deletar um cliente pelo seu id
    public void deletar(long id){
        repository.deleteById(id);
    }





}
