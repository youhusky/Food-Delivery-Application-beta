package com.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by joshua on 7/2/17.
 */
@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Table(name = "PAYMENT")
public class Payment {
    @Id
    @GeneratedValue
    private Long paymentId;

    private String orderId;

    private String date;

    private double price;

    private String cardNo;
    private String expirationDate;
    private String securityCode;

    public Payment(){};
    @JsonCreator
    public Payment(
            @JsonProperty("orderId") String orderId,
            @JsonProperty("cardNo") String cardNumber,
            @JsonProperty("price") double price,
            @JsonProperty("expirationDate") String expirationDate,
            @JsonProperty("securityCode") String securityCode) {
        this.orderId = orderId;
        this.price = price;
        this.date = new Date().toString();
        this.cardNo = cardNumber;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
    }
}
