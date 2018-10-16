package dk.brp.svendeproeve.config;

import org.glassfish.hk2.api.Factory;

/**
 * The type Data source factory.
 */
public class DataSourceFactory implements Factory<DataSourceImpl> {

    @Override
    public DataSourceImpl provide() {
        return new DataSourceImpl(ApplicationProperties.JNDI_REF_NAME);
    }

    @Override
    public void dispose(DataSourceImpl instance) {
        //needed to interface implementation only
    }
}
