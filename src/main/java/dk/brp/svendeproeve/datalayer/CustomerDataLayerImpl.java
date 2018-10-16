package dk.brp.svendeproeve.datalayer;

import dk.brp.svendeproeve.config.DataSource;
import dk.brp.svendeproeve.datalayer.dao.CustomerDAO;
import dk.brp.svendeproeve.model.Customer;
import dk.brp.svendeproeve.model.CustomerList;

import javax.inject.Inject;

public class CustomerDataLayerImpl implements CustomerDataLayer {
    @Inject
    DataSource dataSource;

    @Override
    public CustomerList getAllCustomers() {
        final CustomerList.CustomerListBuilder builder = CustomerList.builder();
        CustomerDAO dao = new CustomerDAO(dataSource);
        builder.customers(dao.getAllCustomers("test-user-1"));
        return builder.build();
    }

    @Override
    public Customer getCustomer(int id) {
        return null;
    }

    @Override
    public void removeCustomer(int id) {

    }

    @Override
    public void updateCustomer(int id, Customer update) {

    }

    @Override
    public int createCustomer(Customer customer) {
        return 0;
    }
}
