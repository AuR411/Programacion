package com.libreria.libreria_api.service;

import com.libreria.libreria_api.LibreriaApiApplication;
import com.libreria.libreria_api.model.Libro;
import com.libreria.libreria_api.repository.LibroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class LibroServiceImp implements LibroService{
        private final LibroRepository libroRepository;

        @Override
        public List<Libro> listarTodos(){
            return libroRepository.findAll();
        }

        @Override
        public Optional<Libro> obtenerPorId(Long id){
            return libroRepository.findById(id);
        }

        @Override
        public Libro crearLibro(Libro libro){
            return libroRepository.save(libro);
        }

        @Override
        public void eliminarLibro(Long id){
            libroRepository.deleteById(id);
        }
}
