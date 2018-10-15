package dk.brp.svendeproeve.model.response;

import dk.brp.svendeproeve.model.enums.OrderStatus;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {
    private int id;
    private int customerId;
    private OrderStatus status;
}
