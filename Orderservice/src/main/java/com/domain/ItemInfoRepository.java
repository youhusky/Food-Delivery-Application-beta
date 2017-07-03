package com.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Created by joshua on 7/2/17.
 */
@RepositoryRestResource(path = "ItemInfo")
public interface ItemInfoRepository extends MongoRepository<ItemInfo, Long> {
    @RestResource(path = "ItemInfo")
    List<ItemInfo> findAllBy();

    @RestResource(path = "delete")
    void deleteAllBy();
}