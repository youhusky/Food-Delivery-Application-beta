package com.service;

import com.domain.RestaurantInfo;
import com.domain.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by joshua on 7/2/17.
 */
@Service
public class RestaurantInfoService {
    @Autowired
    private RestaurantRepository repository;



    public void saveRestaurantInfo(List<RestaurantInfo> restaurantInfos) {
        this.repository.save(restaurantInfos);
    }


    public List<RestaurantInfo> findByName(String name) {
        return repository.findAllByName(name);
    }


    public void deleteAll() {
        this.repository.deleteAll();
    }
}
