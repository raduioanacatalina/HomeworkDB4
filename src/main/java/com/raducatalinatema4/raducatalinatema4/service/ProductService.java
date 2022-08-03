package com.raducatalinatema4.raducatalinatema4.service;

import com.raducatalinatema4.raducatalinatema4.model.Product;
import com.raducatalinatema4.raducatalinatema4.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    List<Product> list = new ArrayList<>();

    public List<Product> getAllProducts() {
        List<Product> aux = new ArrayList<>();
        productRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Product getById(Integer id) {
        return productRepository.findById(id).get();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }

    public Product update(Integer id,Product product) {

        Product aux = productRepository.findById(id).get();
        aux.setName(product.getName());
        aux.setPrice(product.getPrice());
        return productRepository.save(aux);
    }

}
