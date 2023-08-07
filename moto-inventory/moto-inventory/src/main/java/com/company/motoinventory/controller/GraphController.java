package com.company.motoinventory.controller;

import com.company.motoinventory.models.Manufacturer;
import com.company.motoinventory.models.Motorcycle;
import com.company.motoinventory.models.Owner;
import com.company.motoinventory.repository.ManufacturerRepository;
import com.company.motoinventory.repository.MotorcycleRepository;
import com.company.motoinventory.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Controller
public class GraphController {

    @Autowired
    MotorcycleRepository motorcycleRepository;

    @Autowired
    OwnerRepository ownerRepository;

    @Autowired
    ManufacturerRepository manufacturerRepository;


    @QueryMapping
    public List<Motorcycle> motorcycles(){
        return motorcycleRepository.findAll();
    }

    @QueryMapping
    public Motorcycle findMotorcycleById(@Argument int id){
        Optional<Motorcycle> returnVal = motorcycleRepository.findById(id);
        if (returnVal.isPresent()) {
            return returnVal.get();
        } else {
            return null;
        }
    }

//    @MutationMapping
//    public Motorcycle addMotorcycle(
//            @Argument String id,
//            @Argument String make,
//            @Argument String model,
//            @Argument int year,
//            @Argument int ownerId,
//            @Argument int manufacturerId) {
//        Motorcycle newMoto = new Motorcycle(id, make, model, year, ownerId, manufacturerId);
//
//        return motorcycleRepository.save(newMoto);
//    }
//
//    @MutationMapping
//    public Motorcycle updateMotorcycle(
//            @Argument String id,
//            @Argument String make,
//            @Argument String model,
//            @Argument int year,
//            @Argument int ownerId,
//            @Argument int manufacturerId){
//        Motorcycle updatedMotorcycle = new Motorcycle(id, make, model, year, ownerId, manufacturerId);
//        return motorcycleRepository.save(updatedMotorcycle);
//    }
//
//    @MutationMapping
//    public void deleteMotorcycleById(@Argument int id) {
//         motorcycleRepository.deleteById(id);
//    }

    @SchemaMapping
    public Owner owner (Motorcycle motorcycle) {
        Optional<Owner> returnVal = ownerRepository.findById(motorcycle.getOwnerId());
        if (returnVal.isPresent()) {
            return returnVal.get();
        }else {
            return null;

        }
    }

    @SchemaMapping
    public Manufacturer manufacturer(Motorcycle motorcycle){
        Optional<Manufacturer>returnVal = manufacturerRepository.findById(motorcycle.getManufacturerId());
        if (returnVal.isPresent()) {
            return returnVal.get();
        } else {
            return null;
        }
    }


}
