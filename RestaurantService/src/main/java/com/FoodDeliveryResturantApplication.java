package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by joshua on 7/2/17.
 */
@SpringBootApplication
public class FoodDeliveryResturantApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FoodDeliveryResturantApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(FoodDeliveryResturantApplication.class, args);
    }
}
