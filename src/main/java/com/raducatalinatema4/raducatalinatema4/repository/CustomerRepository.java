package com.raducatalinatema4.raducatalinatema4.repository;

import com.raducatalinatema4.raducatalinatema4.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findAll();
}
