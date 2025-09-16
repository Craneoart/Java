package com.craneoart.gestorVenta.controller;

import com.craneoart.gestorVenta.service.ProductoService;
import com.craneoart.gestorVenta.entity.Producto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*") //Comunicación con Front
public class ProdcutoController {
    //Variable de instancia, hay que inicializarla
    private final ProductoService productoService;

    public ProdcutoController(ProductoService productoService) {
        //Aquí se esta inicializando mediante inyección de dependencias.
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> getAll(){
        return productoService.getAllProductos();
    }

    @GetMapping("/{id}")
    public Producto getById(@PathVariable Long id) {
        return productoService.getProductoById(id).orElse(null);
    }

    @PostMapping
    public Producto create(@RequestBody Producto producto) {
        return productoService.saveProducto(producto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> update(@PathVariable Long id, @RequestBody Producto producto) {
        Optional<Producto> productoExistente = productoService.getProductoById(id);

        if (productoExistente.isPresent()) {
            producto.setId(id); // Asignamos el ID al objeto recibido
            Producto actualizado = productoService.saveProducto(producto);
            return ResponseEntity.ok(actualizado);
        } else {
            return ResponseEntity.notFound().build(); // Retorna 404 si no existe
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productoService.deleteProduct(id);
    }

}
