package com.example.javaexerciseapirest.controllers;

import com.example.javaexerciseapirest.models.ParkingLot;
import com.example.javaexerciseapirest.services.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkingLotController {

   private ParkingLotService parkingLotService;

   @Autowired
    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    @GetMapping("/get-parking-lot")
    public List<ParkingLot> getParkingLot() {
        return parkingLotService.getParkingLot();
    }
}
