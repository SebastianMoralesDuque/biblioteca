package org.example.entidades;

import lombok.*;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

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

    @ManyToMany
    @JoinTable(
      name = "libro_autor", 
      joinColumns = @JoinColumn(name = "libro_isbn"), 
      inverseJoinColumns = @JoinColumn(name = "autor_codigo"))
    private List<Autor> autores;

    private Integer unidades;
    private Integer anio;
}
