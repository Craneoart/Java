package com.craneoart.gestorVenta.service;

import com.craneoart.gestorVenta.entity.Producto;
import com.craneoart.gestorVenta.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository repository;

    //Inyección del repositorio - Interfaz que manejas las operaciones CRUD
    public ProductoService(ProductoRepository repository) {
        this.repository =repository;
    }

    public List<Producto> getAllProductos() {
        return repository.findAll();
    }

    public Optional<Producto> getProductoById(Long id) {
        return repository.findAllById(id);
    }

    public Producto saveProducto(Producto producto) {
        return repository.save(producto);
    }

    public void deleteProduct(Long id){
        repository.deleteById(id);
    }

}
