package dk.brp.svendeproeve.datalayer.dao;

import javax.sql.DataSource;

public class OrderDAO {
    private DataSource dataSource;

    public OrderDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
