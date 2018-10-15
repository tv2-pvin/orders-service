package dk.brp.svendeproeve.resource.impl;

import dk.brp.svendeproeve.model.response.OrderList;
import dk.brp.svendeproeve.resource.Orders;

public class OrdersResource implements Orders {
    public OrderList getAllOrders(String status) {
        return OrderList.builder().build();
    }
}
