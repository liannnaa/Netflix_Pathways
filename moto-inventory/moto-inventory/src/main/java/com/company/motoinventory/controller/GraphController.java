package com.company.motoinventory.controller;

import com.company.motoinventory.models.Motorcycle;
import com.company.motoinventory.repository.MotorcycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GraphController {
    @Autowired
    MotorcycleRepository motorcycleRepository;

    @QueryMapping
    public List<Motorcycle> motorcycles(){
        return motorcycleRepository.getMotorcycles();
    }

    @QueryMapping
    public Motorcycle findMotorcycleById(@Argument String id){
        return motorcycleRepository.getMotorcycleById(id);
    }
}
