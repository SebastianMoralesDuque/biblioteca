package org.example.entidades;

import lombok.*;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Prestamo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "cedula_persona", nullable = false)
    private String cedulaPersona;

    @Column(name = "fecha_prestamo", nullable = false)
    private Date fechaPrestamo;

    @Column(name = "fecha_devolucion")
    private Date fechaDevolucion;

    @ManyToMany
    @JoinTable(
      name = "prestamo_libro", 
      joinColumns = @JoinColumn(name = "prestamo_codigo"), 
      inverseJoinColumns = @JoinColumn(name = "libro_isbn"))
    private List<Libro> libros;
}
