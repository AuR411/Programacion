package com.libreria.libreria_api.service;
import com.libreria.libreria_api.model.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {

        List<Cliente> listarTodos();
        Optional<Cliente> obternerPorId(Long id);

        Optional<Cliente> obtenerPorId(Long id);

        Cliente crearCliente(Cliente cliente);
        void eliminarCliente(Long id);

}
