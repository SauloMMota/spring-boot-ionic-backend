package com.saulomendes.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saulomendes.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
