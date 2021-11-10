package com.example.CustomerManagementSystem.controller;

import com.example.CustomerManagementSystem.entity.Customer;
import com.example.CustomerManagementSystem.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @PostMapping(value = "/addCustomer")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        return new ResponseEntity<Customer>(customerService.addCustomer(customer), HttpStatus.CREATED);
    }

    @GetMapping(value = "/showAllCustomer")
    public ResponseEntity<List<Customer>> addCustomer(){
        return new ResponseEntity<List<Customer>>(customerService.showAllCustomer(), HttpStatus.OK);
    }
}
