package edu.itm.torneos.services;

import edu.itm.torneos.identities.Persona;
import edu.itm.torneos.repositories.PersonasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class personasServices {
    private final PersonasRepository repository;

    public personasServices(PersonasRepository repository) {
        this.repository = repository;
    }

    public List<Persona> listaPersonas() {
        return repository.listaPersonas();
    }
}
