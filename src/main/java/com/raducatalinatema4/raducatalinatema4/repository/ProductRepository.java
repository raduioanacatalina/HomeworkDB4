package com.raducatalinatema4.raducatalinatema4.repository;

import com.raducatalinatema4.raducatalinatema4.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Integer> {
    List<Product> findAll();
}
