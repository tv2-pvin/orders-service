package dk.brp.svendeproeve.config;

import lombok.extern.slf4j.Slf4j;

/**
 * The type Application properties.
 */
@Slf4j
public final class ApplicationProperties {
    private static final String APPLICATION_PREFIX = "orders";
    public static final String JNDI_REF_NAME;

    static {
        try {
            JNDI_REF_NAME = System.getenv(APPLICATION_PREFIX + "_jndi_reference_name");
        } catch (Exception ex) {
            log.error("error initializing.", ex);
            throw new IllegalStateException(ex);
        }
    }

    private ApplicationProperties() {
    }
}
