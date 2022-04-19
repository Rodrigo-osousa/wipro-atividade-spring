package com.wipro.classea.repository;

import com.wipro.classea.model.Movimentacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends CrudRepository<Movimentacao, Integer> {
}
