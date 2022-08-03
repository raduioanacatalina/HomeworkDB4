package com.raducatalinatema4.raducatalinatema4.repository;

import com.raducatalinatema4.raducatalinatema4.model.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends CrudRepository<Orders, Integer> {
    List<Orders> findAll();
}
