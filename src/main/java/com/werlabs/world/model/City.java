package com.werlabs.world.model;

import javax.persistence.*;

/**
 * Created by rodrigo on 18/11/17.
 */
@Entity
@Table(name = "city")
public class City {


    private Long id;

    private String name;

    private String countryCode;

    private String district;

    private Long population;




    @Column(name = "Name",length = 35)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name = "CountryCode",length = 3)
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Column(name = "District",length = 20)
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Column(name = "Population",length = 11)
    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
