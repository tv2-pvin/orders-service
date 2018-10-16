package dk.brp.svendeproeve.config;

import dk.brp.svendeproeve.datalayer.CustomerDataLayer;
import dk.brp.svendeproeve.datalayer.CustomerDataLayerImpl;
import dk.brp.svendeproeve.datalayer.OrderDataLayer;
import dk.brp.svendeproeve.datalayer.OrderDataLayerImpl;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

import javax.inject.Singleton;

/**
 * The type Sportsdata bindings.
 */
public class ApplicationBindings extends AbstractBinder {
    @Override
    protected void configure() {
        bind(CustomerDataLayerImpl.class).to(CustomerDataLayer.class).in(Singleton.class);
        bind(OrderDataLayerImpl.class).to(OrderDataLayer.class).in(Singleton.class);

        bindFactory(DataSourceFactory.class).to(DataSource.class).in(Singleton.class);
    }
}