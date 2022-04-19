package com.wipro.classea.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Movimentacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numeroCartao;
    private Double valor;
    private LocalDate data;

    public Movimentacao() {
    }

    public Movimentacao(Integer id, String numeroCartao, Double valor, LocalDate data) {
        this.id = id;
        this.numeroCartao = numeroCartao;
        this.valor = valor;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }



    @Override
    public String toString() {
        return "Movimentacao{" +
                "id=" + id +
                ", numeroCartão='" + numeroCartao + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                '}';
    }
}
