package com.example.javaexerciseapirest.models;

import javax.persistence.*;

@Entity
@Table(name = "car", schema = "public")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_car")
    private Integer id;

    private String name;
    private double mileage;
    private String color;

    @OneToOne
    @JoinColumn(name = "id_owner", referencedColumnName = "id")
    private Owner owner;

    public Car() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

}
