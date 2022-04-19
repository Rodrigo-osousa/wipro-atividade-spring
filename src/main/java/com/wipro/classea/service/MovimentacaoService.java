package com.wipro.classea.service;

import com.wipro.classea.model.Movimentacao;
import com.wipro.classea.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    public Movimentacao findById(Integer id) {
        Optional<Movimentacao> obj = movimentacaoRepository.findById(id);
        return obj.orElse(null);
    }

    public List<Movimentacao> findAll() {
        return (List<Movimentacao>) movimentacaoRepository.findAll();
    }

    public Movimentacao update(Integer id, Movimentacao obj) {
        Movimentacao movimentacao = findById(id);
        movimentacao.setData(obj.getData());
        movimentacao.setNumeroCartao(obj.getNumeroCartao());
        movimentacao.setValor(obj.getValor());
        return movimentacaoRepository.save(movimentacao);
    }

    public Movimentacao create(Movimentacao obj){ return movimentacaoRepository.save(obj);}

    public void delete(Integer id) {
        findById(id);
        movimentacaoRepository.deleteById(id);
    }
}
