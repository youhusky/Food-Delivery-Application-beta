package com.Service;

import com.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.ServiceMode;
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

    @Autowired
    private ItemInfoRepository Itemrepository;


    public List<Order> findAllOrders() {
        return this.repository.findAllBy();
    }


    public void placeOrder(Order orderInfo) {
        this.repository.save(orderInfo);
    }


    public void deleteAll() {
        this.repository.deleteAll();
    }


    public void deleteById(String orderId) {
        this.repository.deleteAllByOrderId(orderId);
    }


    public Order findByOrderId(String orderId) {
        return this.repository.findByOrderId(orderId);
    }


    public List<Item> getItemsByRestaurantName(String name) {
        RestTemplate restTemplate = new RestTemplate();
        String url = itemsUrl + "/RestaurantInfo/"+name+"/Items";
        Item[] totalItems = restTemplate.getForObject(url,Item[].class);
        List<Item> res = new ArrayList<Item>();
        res.addAll(Arrays.asList(totalItems));
        return res;

    }


    public List<ItemInfo> displayAllItemsSelected() {
        return this.Itemrepository.findAllBy();
    }


    public void saveItems(ItemInfo itemInfo) {
        this.Itemrepository.save(itemInfo);
    }


    public void deleteAllItemsSelected() {
        this.Itemrepository.deleteAllBy();
    }
}
