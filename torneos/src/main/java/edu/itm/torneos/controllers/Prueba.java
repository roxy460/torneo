package edu.itm.torneos.controllers;

import edu.itm.torneos.identities.Persona;
import edu.itm.torneos.services.personasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class Prueba {

    @Autowired
    private personasServices services;

    @GetMapping("/ping")
    public String Prueba() {

        return "pong";
    }

    @GetMapping("/pruebalista")
    public List<Persona> listaPersonas() {
        return services.listaPersonas();

    }
}
