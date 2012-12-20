package org.opensourcesoftwareandme;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class HelloWorldApp extends Application {

    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(HelloWorldImpl.class);

        return classes;
    }

}
