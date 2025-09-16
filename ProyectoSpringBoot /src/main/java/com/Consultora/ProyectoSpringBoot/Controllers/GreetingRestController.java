package com.Consultora.ProyectoSpringBoot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

    @GetMapping ("/saludo/{name}" )
    public String greeting(String name){
        return "Hola " + name;
    }
}
