package dk.brp.svendeproeve.resource.impl;

import dk.brp.svendeproeve.datalayer.CustomerDataLayer;
import dk.brp.svendeproeve.datalayer.OrderDataLayer;
import dk.brp.svendeproeve.model.OrderList;
import dk.brp.svendeproeve.resource.Order;

import javax.inject.Inject;

public class OrderService implements Order {

    @Inject
    private CustomerDataLayer customerDataLayer;
    @Inject
    private OrderDataLayer orderDataLayer;


    public OrderList getAllOrders(String status) {
        return OrderList.builder().build();
    }
}
