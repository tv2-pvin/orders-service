package dk.brp.svendeproeve.datalayer;

import dk.brp.svendeproeve.model.response.Customer;
import dk.brp.svendeproeve.model.response.CustomerList;

public interface CustomerDataLayer {

    public CustomerList getAllCustomers();

    public Customer getCustomer(int id);

    public void removeCustomer(int id);

    public void updateCustomer(int id, Customer update);

    public int createCustomer(Customer customer);
}
