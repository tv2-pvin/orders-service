package dk.brp.svendeproeve.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCPConfig extends HikariDataSource {

    private static final String ENV_PREFIX = "db";
    private static final String ENV_DATA_SOURCE_CLASS_NAME = ENV_PREFIX + "_data_source_class_name";
    private static final String ENV_AUTO_COMMIT = ENV_PREFIX + "_auto_commit";
    private static final String ENV_CONNECTION_TIMEOUT = ENV_PREFIX + "_connection_timeout";
    private static final String ENV_USER_NAME = ENV_PREFIX + "_user_name";
    private static final String ENV_PASSWORD = ENV_PREFIX + "_password";
    private static final String ENV_POOL_NAME = ENV_PREFIX + "_pool_name";
    private static final String ENV_MAXIMUM_POOL_SIZE = ENV_PREFIX + "_maximum_pool_size";
    private static final String ENV_MINIMUM_IDLE = ENV_PREFIX + "_minimum_idle";
    private static final String ENV_DATA_SOURCE_PROPERTY_URL = ENV_PREFIX + "_data_source_property_url";
    private static final String ENV_REGISTER_M_BEANS = ENV_PREFIX + "_register_MBeans";

    /**
     * Instantiates a new Hikari datasource.
     */
    public HikariCPConfig() {
        super(getConfig());
    }

    private static HikariConfig getConfig() {
        HikariConfig config = new HikariConfig();
        config.setDataSourceClassName(System.getenv(ENV_DATA_SOURCE_CLASS_NAME));
        config.setConnectionTimeout(Integer.parseInt(System.getenv(ENV_CONNECTION_TIMEOUT)));
        config.setAutoCommit(Boolean.parseBoolean(System.getenv(ENV_AUTO_COMMIT)));
        config.setUsername(System.getenv(ENV_USER_NAME));
        config.setPassword(System.getenv(ENV_PASSWORD));
        config.setPoolName(System.getenv(ENV_POOL_NAME));
        config.setMaximumPoolSize(Integer.parseInt(System.getenv(ENV_MAXIMUM_POOL_SIZE)));
        config.addDataSourceProperty("url", System.getenv(ENV_DATA_SOURCE_PROPERTY_URL));
        config.setRegisterMbeans(Boolean.valueOf(System.getenv(ENV_REGISTER_M_BEANS)));
        config.setMinimumIdle(Integer.parseInt(System.getenv(ENV_MINIMUM_IDLE)));
        return config;
    }
}