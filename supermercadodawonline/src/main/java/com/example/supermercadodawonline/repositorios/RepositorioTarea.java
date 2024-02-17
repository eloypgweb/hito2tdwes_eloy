package com.example.supermercadodawonline.repositorios;

import com.example.supermercadodawonline.model.jpa.Cliente;
import com.example.supermercadodawonline.model.jpa.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositorioTarea extends JpaRepository<Tarea, Integer> {
    List<Tarea> findByCliente(Cliente cliente);
}
