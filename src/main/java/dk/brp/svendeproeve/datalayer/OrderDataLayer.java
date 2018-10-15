package dk.brp.svendeproeve.datalayer;

import dk.brp.svendeproeve.model.enums.OrderStatus;
import dk.brp.svendeproeve.model.response.Customer;
import dk.brp.svendeproeve.model.response.Order;
import dk.brp.svendeproeve.model.response.OrderList;

public interface OrderDataLayer {

    public OrderList getAllOrders();

    public OrderList getAllOrdersForCustomer(Customer customer);

    public OrderList getAllOrdersWithStatus(OrderStatus orderStatus);

    public Order getOrder(int id);

    public void updateOrder(int id, Order update);

    public int createOrder(Order order);

    public void removeOrder(int id);
}
