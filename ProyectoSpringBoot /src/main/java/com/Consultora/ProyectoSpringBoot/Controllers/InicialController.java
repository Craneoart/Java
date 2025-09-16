package com.Consultora.ProyectoSpringBoot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicialController {

        @GetMapping({"/metodo", "Principal", "/hw", "/metodo"})
        public String metodoInicial() {
        System.out.println("Solicitud ejecutada");
        return "Metodo principal del controlador";
    }
}
