package com.werlabs.world.model;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by rodrigo on 21/11/17.
 */
public class ContinentConverterTest {


    ContinentConverter continentConverter = new ContinentConverter();

    @Test
    public void shouldConvertContinent(){
        assertThat(continentConverter.convertToDatabaseColumn(Continent.NORTH_AMERICA),is("North America"));
    }


    @Test
    public void shouldConvertString(){
        assertThat(continentConverter.convertToEntityAttribute("North America"), is(Continent.NORTH_AMERICA));
    }


}