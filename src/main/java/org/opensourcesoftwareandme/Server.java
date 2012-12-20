package org.opensourcesoftwareandme;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import javax.ws.rs.ext.RuntimeDelegate;

public class Server {

    public static void main(String args[]) throws Exception {
        JAXRSServerFactoryBean jaxrsServerFactory = RuntimeDelegate.getInstance().createEndpoint(new HelloWorldApp(), JAXRSServerFactoryBean.class);
        jaxrsServerFactory.setAddress("http://localhost:9000");
        org.apache.cxf.endpoint.Server server = jaxrsServerFactory.create();
        server.start();

        System.out.println("Server started...");
        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server stopping...");
        server.stop();
        System.exit(0);
    }

}
