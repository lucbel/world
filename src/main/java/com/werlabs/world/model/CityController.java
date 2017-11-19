package com.werlabs.world.model;

import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.Collection;

/**
 * Created by rodrigo on 19/11/17.
 */

@Controller
@Path("/city")
public class CityController {

    @GET
    @Produces("application/json")
    public Collection<City> getAll(){
        return null;
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response create(City city){
        //TODO create city
        return Response.created(URI.create("/" + city.getId())).build();
    }

    @GET
    @Produces("application/json")
    @Path("/{id}")
    public City retrieve(@PathParam("id") int id) {
        return null;
    }

    @PUT
    @Produces("application/json")
    @Path("/{id}")
    public Response update(@PathParam("id") int id) {
        return Response.noContent().build();
    }

    @DELETE
    @Produces("application/json")
    @Path("/{id}")
    public Response delete(@PathParam("id") int id) {
        //TODO delete city
        return Response.ok().build();
    }

}
