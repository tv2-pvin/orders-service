package dk.brp.svendeproeve.resource;

import dk.brp.svendeproeve.model.OrderList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("orders")
public interface Order {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    OrderList getAllOrders(@QueryParam("status") String status);
}
