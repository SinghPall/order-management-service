# order-management-service
has two microservices: Order Service and Order Item Service. The both Services are responsible for creating new orders/orderitems, retrieving existing order/orderitems info.

 The Order Service is responsible for creating new orders, retrieving existing order info. 
 Similarly, Order Item Service is responsible for creating order items, retrieving order items. 

Order Item has below data: 
- Product code 
- Product name 
- Quantity 

Order has below data: 
- Customer name 
- Order date 
- Shipping address 
- Order items 
- Total ($) 

Tech requirements: 
- Use FeignClient for inter-service communication 
- Use H2 DB to store order & order item data 
- Need to have global exception handler to handle exceptions like OrderNotFound 
- Need to validate request input - APIs should be exposed as REST APIs 
