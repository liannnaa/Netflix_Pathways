package com.company.motoinventory.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "owner")
public class Owner {
    @Id
    @Column(name="owner_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch= FetchType.EAGER)
    @JoinColumn(name="owner_id")
    private List<Motorcycle> motorcycles;

    public Owner(){}
    public Owner(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return getId() == owner.getId() && Objects.equals(getName(), owner.getName()) && Objects.equals(getAddress(), owner.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAddress());
    }
}

