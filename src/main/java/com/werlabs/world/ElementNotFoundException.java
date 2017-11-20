package com.werlabs.world;

/**
 * Created by rodrigo on 20/11/17.
 */
public class ElementNotFoundException extends RuntimeException {

    private Long id;

    private String type;

    public ElementNotFoundException(Object id,String type){
        super(String.format("The %s with id %s does not exists.",type,id));
    }

}
