package dk.brp.svendeproeve.resource.impl;

import dk.brp.svendeproeve.datalayer.CustomerDataLayer;
import dk.brp.svendeproeve.model.CustomerList;
import dk.brp.svendeproeve.resource.Customer;

import javax.inject.Inject;

public class CustomerService implements Customer {

    @Inject
    CustomerDataLayer customerDataLayer;


    @Override
    public CustomerList getAllCustomers() {
        return customerDataLayer.getAllCustomers();
    }
}
