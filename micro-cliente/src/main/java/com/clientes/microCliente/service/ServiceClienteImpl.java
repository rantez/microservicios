package com.clientes.microCliente.service;

import com.clientes.microCliente.model.Cliente;
import com.clientes.microCliente.repository.ClientesJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClienteImpl implements ServiceCliente {

    @Autowired
    @Qualifier("clientesJpaRepository")
    private ClientesJpaRepository clientesJpaRepository;

    @Override
    public List<Cliente> getClientes() {
        return clientesJpaRepository.findAll();
    }
}
