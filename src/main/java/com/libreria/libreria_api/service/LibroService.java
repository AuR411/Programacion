package com.libreria.libreria_api.service;

import com.libreria.libreria_api.model.Libro;

import java.util.List;
import java.util.Optional;

public interface LibroService {

    List<Libro> listarTodos();
    Optional<Libro> obtenerPorId(Long id);
    Libro crearLibro(Libro libro);
    void eliminarLibro(Long id);
}
