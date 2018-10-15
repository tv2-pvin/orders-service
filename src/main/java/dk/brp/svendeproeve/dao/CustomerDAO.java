package dk.brp.svendeproeve.dao;

import javax.sql.DataSource;

public class CustomerDAO {
    private DataSource dataSource;

    public CustomerDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
