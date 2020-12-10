package com.example.javaexerciseapirest.controllers;

import com.example.javaexerciseapirest.models.Owner;
import com.example.javaexerciseapirest.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OwnerController {

    private OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/get-owners")
    public List<Owner> getOwners() {
        return ownerService.getOwners();
    }
}
