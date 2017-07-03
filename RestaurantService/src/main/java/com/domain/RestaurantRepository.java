package com.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by joshua on 7/2/17.
 */
@RepositoryRestResource(path = "RestaurantInfo")
public interface RestaurantRepository extends MongoRepository<RestaurantInfo, Long> {


    @RestResource(path = "Restaurant")
    List<RestaurantInfo> findAllByName(String name);

    @RestResource(path = "Restaurant")
    List<RestaurantInfo> findAllBy();

}
