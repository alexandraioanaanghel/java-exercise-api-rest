package com.example.javaexerciseapirest.services;

import com.example.javaexerciseapirest.models.Car;
import com.example.javaexerciseapirest.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Table;
import java.util.List;

@Service
public class CarService {

    private CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars() {
        return carRepository.findAll();
    }

    public Car getCar(int id)
    {
        return carRepository.findById(id).orElseThrow();
    }
}
