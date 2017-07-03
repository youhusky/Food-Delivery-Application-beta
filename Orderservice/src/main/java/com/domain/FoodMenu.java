package com.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by joshua on 7/2/17.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FoodMenu {

        private String foodName;
        private double foodPrice;

        @JsonCreator
        public FoodMenu(@JsonProperty("foodName") String foodName,
                    @JsonProperty("foodPrice") double foodPrice){
            this.foodPrice = foodPrice;
            this.foodName = foodName;
        }

}
