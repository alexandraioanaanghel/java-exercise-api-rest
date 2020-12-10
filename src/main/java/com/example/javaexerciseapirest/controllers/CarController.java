package com.example.javaexerciseapirest.controllers;

import com.example.javaexerciseapirest.models.Car;
import com.example.javaexerciseapirest.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/get-cars")
    public List<Car> getCars() {
        return carService.getCars();
    }

    @GetMapping("/get-car")
    public Car getCar(int id) {
        return carService.getCar(id);
    }

}
