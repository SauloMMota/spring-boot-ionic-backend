package com.saulomendes.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saulomendes.cursomc.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
