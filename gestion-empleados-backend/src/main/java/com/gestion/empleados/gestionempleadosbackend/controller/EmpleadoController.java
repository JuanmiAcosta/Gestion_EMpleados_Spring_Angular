package com.gestion.empleados.gestionempleadosbackend.controller;

import com.gestion.empleados.gestionempleadosbackend.persistence.entity.Empleado;
import com.gestion.empleados.gestionempleadosbackend.persistence.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmpleadoController { //Para acceder a la docu swagger -> localhost:8080/swagger-ui.html

    @Autowired
    private EmpleadoRepository repository;

    @GetMapping("/empleados")
    public List<Empleado> listarTodosLosEmpleados(){
        return this.repository.findAll();
    }
}
