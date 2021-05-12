package com.saulomendes.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saulomendes.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
