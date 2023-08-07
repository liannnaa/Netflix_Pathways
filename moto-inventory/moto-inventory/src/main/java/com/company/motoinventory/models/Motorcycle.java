package com.company.motoinventory.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "motorcycle")
public class Motorcycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String make;
    private String model;
    private int year;
    @Column(name="owner_id")
    private int ownerId;
    @Column(name="manufacturer_id")
    private int manufacturerId;

    public Motorcycle(){}
    public Motorcycle(int id, String make, String model, int year, int ownerId, int manufacturerId) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.ownerId = ownerId;
        this.manufacturerId = manufacturerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorcycle that = (Motorcycle) o;
        return getId() == that.getId() && getYear() == that.getYear() && getOwnerId() == that.getOwnerId() && getManufacturerId() == that.getManufacturerId() && Objects.equals(getMake(), that.getMake()) && Objects.equals(getModel(), that.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMake(), getModel(), getYear(), getOwnerId(), getManufacturerId());
    }
}
