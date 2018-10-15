package dk.brp.svendeproeve.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("orders")
public interface Orders {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<Object> getAllOrders(@QueryParam("status") String status);
}
