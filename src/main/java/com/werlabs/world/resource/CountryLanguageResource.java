package com.werlabs.world.resource;

/**
 * Created by rodrigo on 21/11/17.
 */

import com.werlabs.world.ElementNotFoundException;
import com.werlabs.world.model.Country;
import com.werlabs.world.model.CountryLanguage;
import com.werlabs.world.model.CountryLanguageId;
import com.werlabs.world.repository.CountryLanguageRepository;
import jersey.repackaged.com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.Collection;

@Component
@Path("/countrylanguage")
public class CountryLanguageResource {



    @Autowired
    CountryLanguageRepository countryLanguageRepository;


    @GET
    @Produces("application/json")
    public Collection<CountryLanguage> getAll() {
        return Lists.newArrayList(countryLanguageRepository.findAll());
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response create(CountryLanguage countryLanguage) {
        countryLanguageRepository.save(countryLanguage);
        return Response.created(URI.create("/" + countryLanguage.getId().getCountryCode()+"/" +countryLanguage.getId().getLanguage())).build();
    }

    @GET
    @Produces("application/json")
    @Path("/{code}/{language}")
    public CountryLanguage retrieve(@PathParam("code") String code,@PathParam("language") String language) {

        CountryLanguage countryLanguage = countryLanguageRepository.findOne(new CountryLanguageId(code,language));
        if(countryLanguage == null) {
            throw new ElementNotFoundException(code, "Country");
        }
        return countryLanguage;
    }

    @PUT
    @Produces("application/json")
    @Path("/{code}/{language}")
    public Response update(@PathParam("code") String code,@PathParam("language") String language, CountryLanguage countryLanguage) {
        CountryLanguage storedCountryLanguage = countryLanguageRepository.findOne(new CountryLanguageId(code,language));
        if(storedCountryLanguage != null){
            storedCountryLanguage.setOfficial(countryLanguage.getOfficial());
            storedCountryLanguage.setPercentage(countryLanguage.getPercentage());
            countryLanguageRepository.save(storedCountryLanguage);
        }
        return Response.noContent().build();
    }

    @DELETE
    @Produces("application/json")
    @Path("/{code}/{language}")
    public Response delete(@PathParam("code") String code, @PathParam("language") String language) {
        countryLanguageRepository.delete(new CountryLanguageId(code,language));
        return Response.ok().build();
    }

}
