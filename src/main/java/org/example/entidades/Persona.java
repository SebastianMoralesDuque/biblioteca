package org.example.entidades;

import lombok.*;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Persona implements Serializable {

    @Id
    private String cedula;

    @Column(nullable = false)
    private String nombre;
    private String email;
    private String telefono;

    @Column(name = "codigo_ciudad")
    private Long codigoCiudad;
}