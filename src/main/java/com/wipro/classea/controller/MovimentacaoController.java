package com.wipro.classea.controller;

import com.wipro.classea.model.Movimentacao;
import com.wipro.classea.model.Usuario;
import com.wipro.classea.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/movimentacao")
@CrossOrigin("*")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoService service;

    @GetMapping("/{id}")
    public ResponseEntity<Movimentacao> getById(@PathVariable Integer id){
    Movimentacao movimentacao = this.service.findById(id);
    return ResponseEntity.ok().body(movimentacao);
    }

    @GetMapping()
    public ResponseEntity<List<Movimentacao>> getAll(){
        List<Movimentacao> movimentacao = this.service.findAll();
        return ResponseEntity.ok().body(movimentacao);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Movimentacao> updateMovimentacao(@PathVariable Integer id, @RequestBody Movimentacao obj) {
        Movimentacao upMovimentacao = this.service.update(id, obj);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(upMovimentacao);
    }

    @PostMapping("/create")
    public ResponseEntity<Movimentacao> createMovimentacao(@RequestBody Movimentacao movimentacao) {
        Movimentacao newObj = this.service.create(movimentacao);
        return ResponseEntity.status(HttpStatus.GONE).body(service.create(movimentacao));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteMovimentacao(@PathVariable Integer id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
