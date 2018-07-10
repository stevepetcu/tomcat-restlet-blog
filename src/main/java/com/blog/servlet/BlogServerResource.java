package com.blog.servlet;

import org.restlet.data.MediaType;
import org.restlet.representation.Representation;
import org.restlet.representation.StringRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class BlogServerResource extends ServerResource {
    private static final String RESOURCE = "{ \"data\": \"Hello, world!\" }";

    @Get
    public Representation applicationJsonRepresentation() {
        return new StringRepresentation(RESOURCE, MediaType.APPLICATION_JSON);
    }

}
