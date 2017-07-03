package com.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by joshua on 7/2/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document
@Data
public class ItemInfo {

    @Id
    @GeneratedValue
    private String id;
    private String itemName;
    private double itemPrice;

    public ItemInfo(){

    }
    @JsonCreator
    public ItemInfo(@JsonProperty("id") String id,
                    @JsonProperty("itemName") String name,
                    @JsonProperty("itemPrice") double price){
        this.id = id;
        this.itemName = name;
        this.itemPrice = price;
    }
}
