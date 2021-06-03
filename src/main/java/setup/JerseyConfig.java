package setup;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("Blok4")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("nl.hu.blok4.v2.services");
    }
}

