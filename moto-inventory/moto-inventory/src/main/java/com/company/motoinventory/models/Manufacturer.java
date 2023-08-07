package com.company.motoinventory.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "manufacturer")
public class Manufacturer {
    @Id
    @Column(name="manufacturer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch= FetchType.EAGER)
    @JoinColumn(name="manufacturer_id")
    private List<Motorcycle> motorcycles;

    public Manufacturer(){}

    public Manufacturer(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return getId() == that.getId() && Objects.equals(getName(), that.getName()) && Objects.equals(getLocation(), that.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getLocation());
    }
}
