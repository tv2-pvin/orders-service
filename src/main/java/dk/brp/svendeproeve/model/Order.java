package dk.brp.svendeproeve.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {
    private int id;
    private int customerId;
    private OrderStatus status;
}
