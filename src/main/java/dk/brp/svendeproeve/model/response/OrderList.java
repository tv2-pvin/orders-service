package dk.brp.svendeproeve.model.response;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class OrderList {
    @Builder.Default
    private List<Order> orders = new ArrayList<>();
}
