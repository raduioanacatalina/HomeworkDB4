package com.raducatalinatema4.raducatalinatema4.service;

import com.raducatalinatema4.raducatalinatema4.model.Orders;
import com.raducatalinatema4.raducatalinatema4.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;

    List<Orders> list = new ArrayList<>();

    public List<Orders> getAllOrders() {
        List<Orders> aux = new ArrayList<>();
        ordersRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Orders getById(Integer id) {
        return ordersRepository.findById(id).get();
    }

    public Orders save(Orders orders) {
        return ordersRepository.save(orders);
    }

    public void deleteById(Integer id) {
        ordersRepository.deleteById(id);
    }

    public Orders update(Integer id,Orders orders) {

        Orders aux = ordersRepository.findById(id).get();
        aux.setComments(orders.getComments());
        aux.setStatus(orders.getStatus());
        return ordersRepository.save(aux);
    }
}
