package com.jersey.service;

import com.jersey.jaxb.Entry;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author cplonka
 */
@Path("/api")
public class ExampleService {

    public static final String PATH = "/api";

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getText(@QueryParam("name") String name) {
        return Response.ok(String.format("Hello %s!", name)).build();
    }

    @GET
    @Path("/jaxb")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Entry getJAXB() {
        return new Entry(0, "ENTRY");
    }
}
