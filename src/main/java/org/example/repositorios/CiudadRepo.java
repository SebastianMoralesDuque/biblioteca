package org.example.repositorios;

import org.example.entidades.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepo extends JpaRepository<Ciudad, Long> {
}
