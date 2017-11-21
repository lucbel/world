package com.werlabs.world.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Created by rodrigo on 21/11/17.
 */
@Converter(autoApply = true)
public class BooleanConverter implements AttributeConverter<Boolean,String> {
    @Override
    public String convertToDatabaseColumn(Boolean aBoolean) {
        if(aBoolean){
            return "T";
        }
        return "F";
    }

    @Override
    public Boolean convertToEntityAttribute(String s) {
        if("T".equals(s)){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
