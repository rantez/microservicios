package com.clientes.microCliente.repository;

import com.clientes.microCliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("clientesJpaRepository")
public interface ClientesJpaRepository extends JpaRepository<Cliente, Integer> {
}
