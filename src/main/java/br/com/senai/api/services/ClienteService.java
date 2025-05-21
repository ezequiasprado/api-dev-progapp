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

    public List<Cliente> listarTodos(){
        return repository.findAll();
    }

    public Cliente

}
