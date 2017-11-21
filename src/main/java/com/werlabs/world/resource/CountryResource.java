package com.werlabs.world.resource;

import com.werlabs.world.ElementNotFoundException;
import com.werlabs.world.model.Country;
import com.werlabs.world.repository.CountryRepository;
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
@Path("/country")
public class CountryResource {

    @Autowired
    CountryRepository countryRepository;


    @GET
    @Produces("application/json")
    public Collection<Country> getAll() {
        return Lists.newArrayList(countryRepository.findAll());
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response create(Country country) {
        countryRepository.save(country);
        return Response.created(URI.create("/" + country.getCode())).build();
    }

    @GET
    @Produces("application/json")
    @Path("/{code}")
    public Country retrieve(@PathParam("code") String code) {

        Country Country = countryRepository.findOne(code);
        if(Country == null) {
            throw new ElementNotFoundException(code, "Country");
        }
        return Country;
    }

    @PUT
    @Produces("application/json")
    @Path("/{code}")
    public Response update(@PathParam("code") String code, Country country) {
        Country storedCountry = countryRepository.findOne(code);
        if(storedCountry != null){
            storedCountry.setCode2(country.getCode2());
            storedCountry.setCapital(country.getCapital());
            storedCountry.setName(country.getName());
            storedCountry.setPopulation(country.getPopulation());
            storedCountry.setContinent(country.getContinent());
            storedCountry.setGnp(country.getGnp());
            storedCountry.setGnpOld(country.getGnpOld());
            storedCountry.setGovernmentForm(country.getGovernmentForm());
            storedCountry.setHeadOfState(country.getHeadOfState());
            storedCountry.setSurfaceArea(country.getSurfaceArea());
            storedCountry.setLifeExpentancy(country.getLifeExpentancy());
            storedCountry.setLocalName(country.getLocalName());
            storedCountry.setRegion(country.getRegion());
            storedCountry.setYearOfIndependence(country.getYearOfIndependence());
            countryRepository.save(storedCountry);
        }
        return Response.noContent().build();
    }

    @DELETE
    @Produces("application/json")
    @Path("/{code}")
    public Response delete(@PathParam("code") String code) {
        countryRepository.delete(code);
        return Response.ok().build();
    }

}
