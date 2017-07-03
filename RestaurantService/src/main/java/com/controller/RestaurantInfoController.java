package com.controller;

import com.domain.ItemInfo;
import com.domain.RestaurantInfo;
import com.service.RestaurantInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joshua on 7/2/17.
 */
@RestController
public class RestaurantInfoController {

    private RestaurantInfoService service;

    @Autowired
    public RestaurantInfoController(RestaurantInfoService service) {
        this.service = service;
    }

    @RequestMapping(value = "/RestaurantInfo", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void upload(@RequestBody List<RestaurantInfo> restaurantInfos){
        this.service.saveRestaurantInfo(restaurantInfos);

    }
    @RequestMapping(value = "/RestaurantInfo", method = RequestMethod.DELETE)
    public void delete(){
        this.service.deleteAll();
    }

    @RequestMapping(value = "/RestaurantInfo", method = RequestMethod.GET)
    public void findAllBy(){
        this.service.findAllBy();
    }


    @RequestMapping(value = "/RestaurantInfo/{name}", method = RequestMethod.GET)
    public List<RestaurantInfo> findRestaurant(@PathVariable String name){
        return this.service.findByName(name);
    }



    @RequestMapping(value = "/RestaurantInfo/{name}/Items", method = RequestMethod.GET)
    public List<ItemInfo> findItems(@PathVariable String name){
        List<RestaurantInfo> restaurantInfos = this.service.findByName(name);
        List<ItemInfo> itemInfos = new ArrayList<>();
        itemInfos.addAll(restaurantInfos.get(0).getMenuItems());
        return itemInfos;
    }
}
