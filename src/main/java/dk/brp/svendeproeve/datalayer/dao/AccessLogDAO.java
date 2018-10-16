package dk.brp.svendeproeve.datalayer.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Slf4j
public class AccessLogDAO {
    private static ObjectMapper mapper = new ObjectMapper();
    private static final String INSERT = "insert into access_log (\"table\", key, \"user\", \"action\", succesful, sql_statement, object) \n" +
            " VALUES (?, ?, ?, ?::action, ?, ?, ?::json)";

    public static void insertAccessLog(Connection connection, String table, String user, int key, String action, boolean successful, String sql, Object object) {
        try {
            connection.setAutoCommit(false);
            try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT)) {
                preparedStatement.setString(1, table);
                preparedStatement.setInt(2, key);
                preparedStatement.setString(3, user);
                preparedStatement.setString(4, action);
                preparedStatement.setBoolean(5, successful);
                preparedStatement.setString(6, sql);
                preparedStatement.setObject(7, object != null ? mapper.writeValueAsString(object) : "{}");
                preparedStatement.executeUpdate();
                connection.commit();
            } catch (SQLException | JsonProcessingException e) {
                log.error("error inserting to access_log", e);
                connection.rollback();
            }
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            log.error("error on roll back", e);
        }
    }

}
