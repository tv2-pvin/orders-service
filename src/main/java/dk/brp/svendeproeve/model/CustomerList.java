package dk.brp.svendeproeve.model;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class CustomerList {
    @Builder.Default
    private List<Customer> customers = new ArrayList<>();
}
