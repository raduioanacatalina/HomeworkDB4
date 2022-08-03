package com.raducatalinatema4.raducatalinatema4.controller;

import com.raducatalinatema4.raducatalinatema4.model.Customer;
import com.raducatalinatema4.raducatalinatema4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("{id}")
    public Customer getById(@PathVariable Integer id) {
        return customerService.getById(id);
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @PutMapping("{id}")
    public Customer update(@PathVariable Integer id,@RequestBody Customer customer)
    {
        return customerService.update(id,customer);
    }
    @DeleteMapping("{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        customerService.deleteById(id);
    }
}
