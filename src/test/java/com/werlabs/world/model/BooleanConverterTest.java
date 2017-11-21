package com.werlabs.world.model;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by rodrigo on 21/11/17.
 */
public class BooleanConverterTest {

    BooleanConverter booleanConverter = new BooleanConverter();

    @Test
    public void shouldConvertToDatabaseColumnTrue() throws Exception {
        assertThat(booleanConverter.convertToDatabaseColumn(Boolean.TRUE),is("T"));
    }

    @Test
    public void shouldConvertToDatabaseColumnFalse() throws Exception {
        assertThat(booleanConverter.convertToDatabaseColumn(Boolean.FALSE),is("F"));
    }

    @Test
    public void shouldConvertToEntityAttributeFalse() throws Exception {
        assertThat(booleanConverter.convertToEntityAttribute("F"),is(Boolean.FALSE));
    }

    @Test
    public void shouldConvertToEntityAttributeTrue() throws Exception {
        assertThat(booleanConverter.convertToEntityAttribute("T"),is(Boolean.TRUE));
    }


}