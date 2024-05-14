package com.mscompra.compra.repository;

import com.mscompra.compra.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
