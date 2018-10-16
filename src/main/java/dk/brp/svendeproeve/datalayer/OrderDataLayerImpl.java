package dk.brp.svendeproeve.datalayer;

import dk.brp.svendeproeve.config.DataSource;
import dk.brp.svendeproeve.model.OrderStatus;
import dk.brp.svendeproeve.model.Customer;
import dk.brp.svendeproeve.model.Order;
import dk.brp.svendeproeve.model.OrderList;

import javax.inject.Inject;

public class OrderDataLayerImpl implements OrderDataLayer {
    @Inject
    DataSource dataSource;

    @Override
    public OrderList getAllOrders() {
        return null;
    }

    @Override
    public OrderList getAllOrdersForCustomer(Customer customer) {
        return null;
    }

    @Override
    public OrderList getAllOrdersWithStatus(OrderStatus orderStatus) {
        return null;
    }

    @Override
    public Order getOrder(int id) {
        return null;
    }

    @Override
    public void updateOrder(int id, Order update) {

    }

    @Override
    public int createOrder(Order order) {
        return 0;
    }

    @Override
    public void removeOrder(int id) {

    }
}
