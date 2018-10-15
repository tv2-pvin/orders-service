package dk.brp.svendeproeve;

import io.swagger.jaxrs.config.BeanConfig;
import lombok.extern.slf4j.Slf4j;
import org.glassfish.jersey.server.ResourceConfig;

@Slf4j
public class OrdersApplication extends ResourceConfig {


    public OrdersApplication() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.2");
        beanConfig.setSchemes(new String[]{"https"});
        beanConfig.setHost("localhost:8002");
        beanConfig.setBasePath("/api");
        beanConfig.setResourcePackage("dk.brp.svendeporeve.resources");
        beanConfig.setScan(true);
    }


}