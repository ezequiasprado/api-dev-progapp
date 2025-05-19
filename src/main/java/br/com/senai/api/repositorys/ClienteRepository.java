package br.com.senai.api.repositorys;

import br.com.senai.api.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends
        JpaRepository<Cliente,Long> {
}
