package dk.brp.svendeproeve.config;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * The interface Data source.
 */
public interface DataSource {
    /**
     * Gets connection.
     *
     * @return the connection
     * @throws SQLException the sql exception
     */
    Connection getConnection() throws SQLException;

    /**
     * Begin transaction connection.
     *
     * @return the connection
     * @throws SQLException the sql exception
     */
    Connection beginTransaction() throws SQLException;

    /**
     * End transaction.
     *
     * @param connection the connection
     * @throws SQLException the sql exception
     */
    public void endTransaction(Connection connection) throws SQLException;
}
