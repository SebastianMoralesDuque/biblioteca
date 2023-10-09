package org.example.repositorios;

import org.example.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepo extends JpaRepository<Autor, Long> {
}
