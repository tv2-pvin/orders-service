package dk.brp.svendeproeve.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
    private int id;
    private String name;
}
