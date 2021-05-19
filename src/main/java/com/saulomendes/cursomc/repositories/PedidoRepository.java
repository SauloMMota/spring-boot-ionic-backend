package com.saulomendes.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saulomendes.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
