package com.algaworks.festa.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Convidado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    private String nome;

    private Integer quantidadeAcompanhantes;

    private Boolean confirmado = false;

    public Boolean getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(Boolean confirmado) {
        this.confirmado = confirmado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeAcompanhantes() {
        return quantidadeAcompanhantes;
    }

    public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
        this.quantidadeAcompanhantes = quantidadeAcompanhantes;
    }
}
