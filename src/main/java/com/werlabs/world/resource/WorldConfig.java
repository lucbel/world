package com.werlabs.world.resource;

import com.werlabs.world.resource.CityResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by rodrigo on 19/11/17.
 */
@Component
public class WorldConfig extends ResourceConfig {
    public WorldConfig() {
        System.out.println("registering resources");
        register(CityResource.class);
    }
}
