package com.example.javaexerciseapirest.services;

import com.example.javaexerciseapirest.models.ParkingLot;
import com.example.javaexerciseapirest.repositories.ParkingLotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingLotService {

    private ParkingLotRepository parkingLotRepository;

    @Autowired
    public ParkingLotService(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    public List<ParkingLot> getParkingLot() {
        return parkingLotRepository.findAll();
    }
}
