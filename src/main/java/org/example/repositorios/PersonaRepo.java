package org.example.repositorios;

import org.example.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepo extends JpaRepository<Persona, String> {
}
