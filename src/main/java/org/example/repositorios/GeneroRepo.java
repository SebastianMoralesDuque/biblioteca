package org.example.repositorios;

import org.example.entidades.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepo extends JpaRepository<Genero, Long> {
}
