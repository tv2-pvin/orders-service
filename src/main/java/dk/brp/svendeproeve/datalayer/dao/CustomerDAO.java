package dk.brp.svendeproeve.datalayer.dao;

import dk.brp.svendeproeve.config.DataSource;
import dk.brp.svendeproeve.model.Customer;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class CustomerDAO {
    private DataSource dataSource;
    private static final String SELECT =
            "select \n" +
                    "c.id,\n" +
                    "c.name\n" +
                    "FROM customer c\n";

    public CustomerDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Customer> getAllCustomers(String user) {
        List<Customer> customers = new ArrayList<>();
        try (Connection connection = dataSource.getConnection()) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    customers = Customer.toCustomers(resultSet);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                AccessLogDAO.insertAccessLog(connection, "customer", user, 0, "select", false, SELECT, null);
            }
            AccessLogDAO.insertAccessLog(connection, "customer", user, 0, "select", true, SELECT, null);
        } catch (SQLException e) {
            log.error("error obtaining connection");
        }
        return customers;
    }
}
