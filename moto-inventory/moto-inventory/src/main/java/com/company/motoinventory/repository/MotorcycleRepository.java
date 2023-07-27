package com.company.motoinventory.repository;

import com.company.motoinventory.models.Motorcycle;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MotorcycleRepository {

    public MotorcycleRepository(){
        seedDataStore();
    }

    private List<Motorcycle> motorcycles = new ArrayList<>();

    private void seedDataStore() {
        Motorcycle m1 = new Motorcycle("11111", "Honda", "Street Cruiser", 1988);
        Motorcycle m2 = new Motorcycle("22222", "Yamaha", "Moto Cross X", 2005);
        this.motorcycles.add(m1);
        this.motorcycles.add(m2);
    }

    // Retrieve all motorcycles
    public List<Motorcycle> getMotorcycles(){
        return this.motorcycles;
    }

    // Retrieve a motorcycle by id
    public Motorcycle getMotorcycleById(String id) {
        List<Motorcycle> idMatch = this.motorcycles;
        Motorcycle resultMotorcycle = null;
        for (Motorcycle m : idMatch) {
            if (m.getId().equals(id)) {
                resultMotorcycle = m;
            }
        }
        return resultMotorcycle;
    }
}
