package edu.itm.torneos.controllers;

import edu.itm.torneos.identities.Persona;
import edu.itm.torneos.services.personasServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonasController {
    private final personasServices services;

    public PersonasController (personasServices services) {
        this.services = services;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Persona>> listarPersonas() {
        ResponseEntity<List<Persona>> responseEntity;

        try {
            responseEntity = new ResponseEntity<>(services.listaPersonas(), HttpStatus.OK);
        } catch (Exception ex) {
            responseEntity = new ResponseEntity<>(List.of(), HttpStatus.INTERNAL_SERVER_ERROR);
            ex.printStackTrace();
        }
        return responseEntity;
    }
}
