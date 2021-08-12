package com.example.controllers;

import com.example.models.entity.Customers;
import com.example.models.service.ICustomers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value  = "/customers/v1")
public class CustomersController {

    @Autowired
    ICustomers iCustomers;

    @GetMapping("/searchAll")
    public ResponseEntity<List<Customers>> getAll() {
        return new ResponseEntity<>(iCustomers.getAll(), HttpStatus.OK);
    }

}
