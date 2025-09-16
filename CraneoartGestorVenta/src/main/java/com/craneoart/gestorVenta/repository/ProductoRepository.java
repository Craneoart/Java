package com.craneoart.gestorVenta.repository;

import com.craneoart.gestorVenta.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductoRepository extends JpaRepository <Producto, Long> {
    Optional<Producto> findAllById(Long id);
}
