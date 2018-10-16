package dk.brp.svendeproeve.config;

import lombok.extern.slf4j.Slf4j;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * The type Data source.
 */
@Slf4j
public class DataSourceImpl implements DataSource {
    private javax.sql.DataSource dataSource;
    /**
     * Instantiates a new Data source.
     *
     * @param lookup     the lookup
     */
    public DataSourceImpl(String lookup) {
        InitialContext context;
        try {
            context = new InitialContext();
            dataSource = (javax.sql.DataSource) context.lookup(lookup);
        } catch (NamingException e) {
            log.error("Datasource lookup failed.", e);
        }
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public Connection beginTransaction() throws SQLException {
        Connection connection = dataSource.getConnection();
        connection.setAutoCommit(false);
        return connection;
    }

    public void endTransaction(Connection connection) throws SQLException {
        connection.setAutoCommit(true);
        connection.close();
    }

}
