package com.libreria.libreria_api.controller;

import com.libreria.libreria_api.model.Cliente;
import com.libreria.libreria_api.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Clientes")
@RequiredArgsConstructor
public class ClienteController {
    private final ClienteService clienteService;


    //Lista los clientes
    @GetMapping
    public List<Cliente> listarClientes(){
        return  clienteService.listarTodos();
    }
    //Obtiene un libro por ID
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> obtenerClientePorId(@PathVariable Long id){
        Cliente cliente = clienteService.obtenerPorId(id).orElseThrow(() -> new RuntimeException("El cliente no existe"));
        return  ResponseEntity.ok(cliente);
    }
    //Crea un nuevo cliente
    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente){
        return clienteService.crearCliente(cliente);
    }
    //Elimina un cliente por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCliente(@PathVariable Long id){
        clienteService.eliminarCliente(id);
        return ResponseEntity.noContent().build();
    }
}
