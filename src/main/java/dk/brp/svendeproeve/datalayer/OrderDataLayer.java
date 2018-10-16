package dk.brp.svendeproeve.datalayer;

import dk.brp.svendeproeve.model.OrderStatus;
import dk.brp.svendeproeve.model.Customer;
import dk.brp.svendeproeve.model.Order;
import dk.brp.svendeproeve.model.OrderList;

public interface OrderDataLayer {

    public OrderList getAllOrders();

    public OrderList getAllOrdersForCustomer(Customer customer);

    public OrderList getAllOrdersWithStatus(OrderStatus orderStatus);

    public Order getOrder(int id);

    public void updateOrder(int id, Order update);

    public int createOrder(Order order);

    public void removeOrder(int id);
}
