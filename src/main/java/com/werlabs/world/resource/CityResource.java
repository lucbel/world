package com.werlabs.world.resource;

import com.werlabs.world.CityRepository;
import com.werlabs.world.model.City;
import jersey.repackaged.com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.Collection;

/**
 * Created by rodrigo on 19/11/17.
 */

@Component
@Path("/city")
public class CityResource {

    @Autowired
    CityRepository cityRepository;


    @GET
    @Produces("application/json")
    public Collection<City> getAll() {
        System.out.println("calling city getAll");
        return Lists.newArrayList(cityRepository.findAll());
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response create(City city) {
        cityRepository.save(city);
        return Response.created(URI.create("/" + city.getId())).build();
    }

    @GET
    @Produces("application/json")
    @Path("/{id}")
    public City retrieve(@PathParam("id") Long id) {
        return cityRepository.findOne(id);
    }

    @PUT
    @Produces("application/json")
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, City city) {
        City storedCity = cityRepository.findOne(id);
        if(storedCity != null){
            storedCity.setCountryCode(city.getCountryCode());
            storedCity.setDistrict(city.getDistrict());
            storedCity.setName(city.getName());
            storedCity.setPopulation(city.getPopulation());
            cityRepository.save(storedCity);
        }
        return Response.noContent().build();
    }

    @DELETE
    @Produces("application/json")
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {
        cityRepository.delete(id);
        return Response.ok().build();
    }

}
