package edu.itm.torneos.identities;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class Persona {
    String nombre;
    String apellido;
    String email;
    String celular;
    String direccion;
    String cedula;
    String telefono;
    Data fechaNacimiento;
}

