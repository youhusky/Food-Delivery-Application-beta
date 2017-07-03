package com.Service;

import com.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by joshua on 7/2/17.
 */
@Service
public class OrderService {
    @Value("${URL.food-delivery-resturant}")
    String itemsUrl;

    @Autowired
    private OrderRepository repository;

    public List<Order> findAllOrders() {
        return this.repository.findAllBy();
    }


    public void saveOrder(Order orderInfo) {
        this.repository.save(orderInfo);
    }


    public void deleteAll() {
        this.repository.deleteAll();
    }


    public void deleteById(String orderId) {
        this.repository.deleteByOrderId(orderId);
    }


    public Order findByOrderId(String orderId) {
        return this.repository.findByOrderId(orderId);
    }

    public List<FoodMenu> getOrderByRestaurantName(String name) {
        RestTemplate restTemplate = new RestTemplate();
        String url = itemsUrl + "/RestaurantInfo/"+name+"/Items";
        FoodMenu[] totalItems = restTemplate.getForObject(url,FoodMenu[].class);
        List<FoodMenu> res = new ArrayList<FoodMenu>();
        res.addAll(Arrays.asList(totalItems));
        return res;

    }
}
