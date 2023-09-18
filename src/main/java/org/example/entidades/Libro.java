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
public class Libro implements Serializable {

    @Id
    private String isbn;

    @Column(nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "codigo_genero")
    private Genero genero;

    private Integer unidades;
    private Integer anio;
}
