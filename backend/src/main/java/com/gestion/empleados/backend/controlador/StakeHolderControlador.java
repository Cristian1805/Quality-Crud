package com.gestion.empleados.backend.controlador;

import com.gestion.empleados.backend.repositorio.StakeHolderRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class StakeHolderControlador {

    @Autowired
    private StakeHolderRepositorio repositorio;

    @GetMapping("/stakeholder")
    public List <StakeHolderRepositorio> ListarTodosLosStakeHolder(){
        return repositorio.findAll();
    }

}
