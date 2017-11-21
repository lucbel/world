package com.werlabs.world.model;

/**
* Created by rodrigo on 20/11/17.
*/
enum Continent {
    ASIA("Asia"),
    EUROPE("Europe"),
    NORTH_AMERICA("North America"),
    AFRICA("Africa"),
    OCEANIA("Oceania"),
    ANTARCTICA("Antarctica"),
    SOUTH_AMERICA("South America");

    private final String value;

    Continent(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public static Continent getEnum(String name){
        for (Continent continent : values()) {
            if(continent.value.equalsIgnoreCase(name)){
                return continent;
            }

        }
        return null;

    }



}
