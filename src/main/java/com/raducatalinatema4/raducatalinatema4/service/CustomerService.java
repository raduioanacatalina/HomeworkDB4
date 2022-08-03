package com.raducatalinatema4.raducatalinatema4.service;

import com.raducatalinatema4.raducatalinatema4.model.Customer;
import com.raducatalinatema4.raducatalinatema4.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    List<Customer> list = new ArrayList<>();

    public List<Customer> getAllCustomers() {
        List<Customer> aux = new ArrayList<>();
        customerRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Customer getById(Integer id) {
        return customerRepository.findById(id).get();
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteById(Integer id) {
        customerRepository.deleteById(id);
    }

    public Customer update(Integer id,Customer customer) {

        Customer aux = customerRepository.findById(id).get();
        aux.setName(customer.getName());
        aux.setEmail(customer.getEmail());
        return customerRepository.save(aux);
    }

}