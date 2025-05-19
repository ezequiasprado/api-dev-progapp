package br.com.senai.api.repositorys;

import br.com.senai.api.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends
        JpaRepository<Produto,Long> {
}
