# 现在本地Docker起不来了...试图Debuging
0702
# food-delivery-restaurant service

1.upload(): (POST)

"/RestaurantInfo"
upload the initial restaurant and menu data,
2 delete ():(DELETE)

 "/RestaurantInfo"
Delete all the data.
3 findRestaurant() (GET)

"/RestaurantInfo/{name}"
Query the restaurant by name
4 findItems() (GET)

"/RestaurantInfo/{name}/Items"
get menuItems by Restaurant name
food-delivery-order service

1.upload(): (POST)

/OrderService
CREATE ORDERS;
2 delete() :(DELETE)

/OrderService
DELETE ALL ORDERS
3 deleteById() : (DELETE)

/OrderService/{orderId}
DELETE ORDERS BY ID
4 findAll() (GET)

/OrderService
RETURN ALL THE ORDERS
food-delivery-payment service

1.save(): (POST)

/Payment
user make a payment, database store the payment history,
2 delete() :(DELETE)

/Payment
Delete all the history(In real world, better not).
3 findALLPaymentt() (GET)

/Payment
Query the payment history