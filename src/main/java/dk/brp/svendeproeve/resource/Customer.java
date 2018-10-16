package dk.brp.svendeproeve.resource;

import dk.brp.svendeproeve.model.CustomerList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("customers")
public interface Customer {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    CustomerList getAllCustomers();
}
