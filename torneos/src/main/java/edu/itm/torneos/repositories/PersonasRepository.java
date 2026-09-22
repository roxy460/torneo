package edu.itm.torneos.repositories;

import edu.itm.torneos.identities.Persona;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonasRepository {

    public List<Persona> listaPersonas() {
        List<Persona> result = new ArrayList<>();

        result.add(Persona.builder()
                .email("email@email.co")
                .nombre("Rosa")
                .direccion("direccion")
                .cedula("1214715218")
                .apellido("gongora")
                .build());
        result.add(Persona.builder()
                .email("email@email.co")
                .nombre("Maria")
                .direccion("direccion")
                .cedula("2325658")
                .apellido("sierra")
                .build());
        result.add(Persona.builder()
                .email("email@email.co")
                .nombre("Carlos")
                .direccion("direccion")
                .cedula("111111")
                .apellido("lopez")
                .build());

        return result;
    }
}
