package org.example.repositorios;

import org.example.entidades.Ciudad;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class CiudadRepoTest {

    @Autowired
    private CiudadRepo ciudadRepo;

    @Test
    public void testCrudCiudad() {
        // Crear una nueva ciudad
        Ciudad ciudad = new Ciudad();
        ciudad.setNombre("Ciudad de Prueba");

        // Guardar la ciudad en la base de datos (Create)
        ciudadRepo.save(ciudad);

        // Leer la ciudad de la base de datos (Read)
        Optional<Ciudad> ciudadGuardadaOptional = ciudadRepo.findById(ciudad.getCodigo());
        assertTrue(ciudadGuardadaOptional.isPresent());
        Ciudad ciudadGuardada = ciudadGuardadaOptional.get();
        assertEquals("Ciudad de Prueba", ciudadGuardada.getNombre());

        // Actualizar la ciudad (Update)
        ciudadGuardada.setNombre("Ciudad Modificada");
        ciudadRepo.save(ciudadGuardada);

        // Leer la ciudad actualizada de la base de datos
        Optional<Ciudad> ciudadActualizadaOptional = ciudadRepo.findById(ciudadGuardada.getCodigo());
        assertTrue(ciudadActualizadaOptional.isPresent());
        Ciudad ciudadActualizada = ciudadActualizadaOptional.get();
        assertEquals("Ciudad Modificada", ciudadActualizada.getNombre());

        // Eliminar la ciudad de la base de datos (Delete)
        ciudadRepo.deleteById(ciudadActualizada.getCodigo());

        // Verificar que la ciudad se ha eliminado correctamente
        Optional<Ciudad> ciudadEliminadaOptional = ciudadRepo.findById(ciudadActualizada.getCodigo());
        assertFalse(ciudadEliminadaOptional.isPresent());
    }
}
