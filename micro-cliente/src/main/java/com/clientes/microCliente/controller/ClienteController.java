package com.clientes.microCliente.controller;


import com.clientes.microCliente.model.Cliente;
import com.clientes.microCliente.service.ServiceCliente;
import com.clientes.microCliente.service.ServiceClienteImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ServiceClienteImpl serviceCliente;

    @GetMapping(value = "/getCliente")
    public List<Cliente> getCliente(){
        return serviceCliente.getClientes();
    }

}
