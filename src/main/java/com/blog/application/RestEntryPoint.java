package com.blog.application;

import com.blog.servlet.BlogServerResource;
import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class RestEntryPoint extends Application {
    @Override
    public synchronized Restlet createInboundRoot() {
        Router router = new Router(getContext());

        router.attach("/articles", BlogServerResource.class);

        return router;
    }
}
