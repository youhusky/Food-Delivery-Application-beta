# Food Delivery Application
Bozhao Li
## Task
- [x] Function Requirement  
- [x] Non-Functional Requirement
  - [x] Microservices  
  - [x] SQL and NOSQL  
  - [x] OO Design  
  - [x] REST API
  - [x] Tests(in Restaurant service and Payment service)
  - [x] handle error (check length of cardNum and securityCode)
  - [x] security
- [ ] Bonus
  - [?] UI to design a website(a little bit hard for me and time is limited)
  - [?] MQ (still config this function)
  - [x] Spring Cloud circuit(like eureka,hystrix)
  - [x] Well Documented
 	


## Service Function
1. search restaurant by restaurant name
2. user can place an order and make a payment

## Database
1. restaurant-service (MongoDB)
2. Order-service(MongoDB)
3. Payment-service(MYSQL) 

## RESTAPI

### Restaurant Service
```bash
1.upload(): (POST)

"/RestaurantInfo"
upload data. 

2 delete ():(DELETE)

 "/RestaurantInfo"
Delete all the data.

3 findRestaurant() (GET)

"/RestaurantInfo/{name}"
Find the restaurant by name. 

4 findItems() (GET)

"/RestaurantInfo/{name}/Items"
get menuItems by Restaurant name
```

### Order Service
```
1.upload(): (POST)

/OrderService
upload ORDERS;  

2 delete() :(DELETE)

/OrderService
DELETE ALL ORDERS. 

3 deleteById() : (DELETE)

/OrderService/{orderId}
DELETE ORDERS BY ID. 

4 findAll() (GET)

/OrderService
Find ALL ORDERS
```

### Payment Service
```
1.save(): (POST)

/Payment
uipload a payment

2 delete() :(DELETE)

/Payment

3 findALLPaymentt() (GET)

/Payment
Find the payment history

```

## Start
1. Start docker `docker-compose up -d` in these folders `/Orderservice`,`/Paymentservice`,`/Restaurantservice`,`/`
2. Start all servers `sh ./start-server.sh`

```bash
java -jar Orderservice/target/orderservice-1.0-SNAPSHOT.jar&. 
java -jar Paymentservice/target/PaymentService-0.0.1-SNAPSHOT.jar&. 
java -jar RestaurantService/target/RestaurantService-0.0.1-SNAPSHOT.jar&
java -jar platform/eureka/target/eureka-1.0-SNAPSHOT.jar&
java -jar platform/hystrix-dashboard/target/hystrix-dashboard-1.0-SNAPSHOT.jar
```

3. Upload all data `sh ./start-uploadData.sh`

## Run
1. Restaurant server in `localhost:9004`
2. Order server in `localhost:9005`
3. Payment Server in `localhost:9006`
4. Eureka in `localhost:8761`
5. hytrix in `localhost:7979`

## Issue
1. Still need to watch the video about RabbitMQ and how to design a website based on the backend. 
2. Need to bind all the data into one for you can only need to upload a menu for each restaurant rather than upload like order and payment in order to maintain consistencey.

## Reference
1. Bittiger and Ross
2. Spring Document
3. Google and stackoverflow
