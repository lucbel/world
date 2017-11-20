package com.werlabs.world;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by rodrigo on 20/11/17.
 */
@Provider
public class NotFoundExceptionHandler implements ExceptionMapper<ElementNotFoundException> {

    @Override
    public Response toResponse(ElementNotFoundException e) {
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
