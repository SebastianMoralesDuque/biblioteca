package org.example.repositorios;

import org.example.entidades.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepo extends JpaRepository<Prestamo, Long> {
}
