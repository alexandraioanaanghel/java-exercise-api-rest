package com.example.javaexerciseapirest.repositories;

import com.example.javaexerciseapirest.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
}
