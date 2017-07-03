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
public class foodInfo {

    @Id
    @GeneratedValue
    private String cartId;
    public String foodName;
    public double foodPrice;
    public int quantity;
    public String note;

    public foodInfo(){};
    @JsonCreator
    public foodInfo(@JsonProperty("foodName") String foodName,
                    @JsonProperty("foodPrice") double foodPrice,
                    @JsonProperty("quantity") int quantity,
                    @JsonProperty("note") String note){
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.quantity = quantity;
        this.note = note;
    }
}
