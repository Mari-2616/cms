package com.example.CustomerManagementSystem.service;

import com.example.CustomerManagementSystem.entity.Customer;
import com.example.CustomerManagementSystem.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> showAllCustomer() {
        return customerRepository.findAll();
    }
}
