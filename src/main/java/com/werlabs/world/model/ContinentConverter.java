package com.werlabs.world.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Created by rodrigo on 20/11/17.
 */
@Converter(autoApply = true)
public class ContinentConverter implements AttributeConverter<Continent,String> {

    @Override
    public String convertToDatabaseColumn(Continent continent) {
        return continent.toString();
    }

    @Override
    public Continent convertToEntityAttribute(String s) {
        return Continent.getEnum(s);
    }
}
