package com.example.CustomerManagementSystem.service;

import com.example.CustomerManagementSystem.entity.Customer;

import java.util.List;

public interface ICustomerService {

    public Customer addCustomer(Customer customer);
    public List<Customer> showAllCustomer();
}
