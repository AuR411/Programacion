package com.libreria.libreria_api.service;

import com.libreria.libreria_api.model.Cliente;
import com.libreria.libreria_api.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteServiceImp implements ClienteService {

    private final ClienteRepository clienteRepository;

            @Override
            public List<Cliente> listarTodos(){
            return clienteRepository.findAll();
        }

            @Override
            public Optional<Cliente> obternerPorId(Long id) {
            return Optional.empty();
    }

            @Override
            public Optional<Cliente> obtenerPorId(Long id){
            return clienteRepository.findById(id);
        }
            @Override
            public Cliente crearCliente(Cliente cliente){
            return clienteRepository.save(cliente);
        }

            @Override
            public void eliminarCliente(Long id){
            clienteRepository.deleteById(id);
        }
}
