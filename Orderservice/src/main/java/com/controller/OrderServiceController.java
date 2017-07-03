package com.controller;

import com.Service.OrderService;
import com.domain.FoodMenu;
import com.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by joshua on 7/2/17.
 */
@RestController
public class OrderServiceController {

    private OrderService service;


    @Autowired
    public OrderServiceController(OrderService service) {
        this.service = service;
    }

    @RequestMapping(value = "/OrderService", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void Order(@RequestBody Order orders){
        this.service.saveOrder(orders);
    }

    @RequestMapping(value = "/OrderService", method = RequestMethod.DELETE)
    void delete(){
        this.service.deleteAll();
    }

    @RequestMapping(value = "/OrderService", method = RequestMethod.GET)
    public List<Order> findAll(){
        return this.service.findAllOrders();
    }

    @RequestMapping(value = "/OrderService/{orderId}", method = RequestMethod.DELETE)
    void deleteById(@PathVariable String orderId){
        this.service.deleteById(orderId);
    }


    @RequestMapping(value = "/OrderService/Items/{restaurantName}", method = RequestMethod.GET)
    public List<FoodMenu> findOrder(@PathVariable String restaurantName){
        return this.service.getOrderByRestaurantName(restaurantName);
    }

    @RequestMapping(value = "/OrderService/Orders/{orderId}", method = RequestMethod.GET)
    public Order findByOrderId(@PathVariable String orderId){
        return this.service.findByOrderId(orderId);
    }
}
