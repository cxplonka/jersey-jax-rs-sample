package com.jersey;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author cplonka
 */
@ApplicationPath("/")
public class MyApplication extends ResourceConfig {

    public MyApplication() {
        // add package for introspection
        packages(true, "com.jersey.service");
    }
}
