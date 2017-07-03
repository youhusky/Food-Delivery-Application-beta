package com.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by joshua on 7/2/17.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Item {

        private String itemName;
        private double itemPrice;

        @JsonCreator
        public Item(@JsonProperty("itemName") String itemName,
                    @JsonProperty("itemPrice") double itemPrice){
            this.itemPrice = itemPrice;
            this.itemName = itemName;
        }

}
