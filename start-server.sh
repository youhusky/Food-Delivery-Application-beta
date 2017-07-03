#!/usr/bin/env bash
java -jar Orderservice/target/orderservice-1.0-SNAPSHOT.jar&
java -jar Paymentservice/target/PaymentService-0.0.1-SNAPSHOT.jar&
java -jar RestaurantService/target/RestaurantService-0.0.1-SNAPSHOT.jar&
java -jar platform/eureka/target/eureka-1.0-SNAPSHOT.jar&
java -jar platform/hystrix-dashboard/target/hystrix-dashboard-1.0-SNAPSHOT.jar