package dk.brp.svendeproeve.model;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Slf4j
public class Customer {
    private int id;
    private String name;

    public static Customer toCustomer(ResultSet resultSet) {
        final CustomerBuilder builder = Customer.builder();
        try {
            builder
                    .id(resultSet.getInt("id"))
                    .name(resultSet.getString("name"));
        } catch (SQLException e) {
            log.error("error translating customer from db model to api model {}", resultSet, e);
        }
        return builder.build();
    }

    public static List<Customer> toCustomers(ResultSet resultSet) {
        List<Customer> customers = new ArrayList<>();
        try {
            while (resultSet.next())
                customers.add(toCustomer(resultSet));
        } catch (SQLException e) {
            log.error("error translating customers from db model to api model {}", resultSet, e);
        }
        return customers;
    }
}
