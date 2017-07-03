package com.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by joshua on 7/2/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Document
public class RestaurantInfo {

    @Id
    @GeneratedValue
    private String id;
    private String name;
    private String description;

    private List<ItemInfo> menuItems;

    private ItemInfo items;


    @JsonCreator
    public RestaurantInfo(@JsonProperty("Id") String id,
                          @JsonProperty("Name") String name,
                          @JsonProperty("Description") String description,
                          @JsonProperty("menuItems") List<ItemInfo> menuItems){
        this.id = id;
        this.name = name;
        this.description = description;
        this.menuItems = new ArrayList<>(menuItems);
    }




}
