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
@Data
@Document
public class ItemInfo {

    @Id
    @GeneratedValue
    private String cartId;
    public String itemName;
    public double itemPrice;
    public int quantity;
    public String note;

    public ItemInfo(){};
    @JsonCreator
    public ItemInfo(@JsonProperty("itemName") String itemName,
                    @JsonProperty("itemPrice") double itemPrice,
                    @JsonProperty("quantity") int quantity,
                    @JsonProperty("note") String note){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
        this.note = note;
    }
}
