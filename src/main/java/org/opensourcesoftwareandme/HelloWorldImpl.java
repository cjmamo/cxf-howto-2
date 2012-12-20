package org.opensourcesoftwareandme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/helloWorld")
public class HelloWorldImpl {

    @GET
    @Produces("text/html")
    @Path("sayHi/{text}")
    public String sayHi(@PathParam("text") String text) {
        return "Hello " + text;
    }
}
