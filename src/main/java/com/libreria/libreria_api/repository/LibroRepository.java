package com.libreria.libreria_api.repository;

import com.libreria.libreria_api.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {

}
