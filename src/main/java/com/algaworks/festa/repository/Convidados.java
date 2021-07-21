package com.algaworks.festa.repository;

import com.algaworks.festa.model.Convidado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Convidados extends JpaRepository<Convidado, Long> {
}
