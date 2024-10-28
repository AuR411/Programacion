package com.libreria.libreria_api.controller;


import com.libreria.libreria_api.model.Libro;
import com.libreria.libreria_api.service.LibroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/libros")
@RequiredArgsConstructor
public class LibroController {
    private final LibroService libroService;

    @GetMapping
    public List<Libro> listarLibros(){
        return libroService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libro> obtenerLibroPorId(@PathVariable Long id){
        Libro libro = libroService.obtenerPorId(id).orElseThrow(() -> new RuntimeException("El libro no existe"));
        return  ResponseEntity.ok(libro);
    }

    @PostMapping
    public Libro crearLibro(@RequestBody Libro libro){
        return libroService.crearLibro(libro);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarLibro(@PathVariable Long id){
        libroService.eliminarLibro(id);
        return ResponseEntity.noContent().build();
    }
}
