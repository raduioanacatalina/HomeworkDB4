package com.raducatalinatema4.raducatalinatema4.controller;

import com.raducatalinatema4.raducatalinatema4.model.Orders;
import com.raducatalinatema4.raducatalinatema4.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @GetMapping("/all")
    public List<Orders> getAllOrders() {
        return ordersService.getAllOrders();
    }

    @GetMapping("{id}")
    public Orders getById(@PathVariable Integer id) {
        return ordersService.getById(id);
    }

    @PostMapping
    public Orders save(@RequestBody Orders orders){
        return ordersService.save(orders);
    }

    @PutMapping("{id}")
    public Orders update(@PathVariable Integer id,@RequestBody Orders orders)
    {
        return ordersService.update(id,orders);
    }
    @DeleteMapping("{id}")
    public void deleteOrders(@PathVariable Integer id) {
        ordersService.deleteById(id);
    }
}
