#!/usr/bin/env bash
curl -H "Content-Type: application/json" localhost:9004/RestaurantInfo -d @restaurant.json;
curl -H "Content-Type: application/json" localhost:9005/OrderService -d @order.json;
curl -H "Content-Type: application/json" localhost:9006/payment -d @payment.json

