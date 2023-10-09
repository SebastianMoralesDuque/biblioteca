package org.example.repositorios;

import org.example.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepo extends JpaRepository<Libro, String> {
}
