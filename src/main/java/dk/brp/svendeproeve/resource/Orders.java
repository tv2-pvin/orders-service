package dk.brp.svendeproeve.resource;

import dk.brp.svendeproeve.model.response.OrderList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("orders")
public interface Orders {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    OrderList getAllOrders(@QueryParam("status") String status);
}
