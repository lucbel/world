package com.werlabs.world.model;

import org.eclipse.persistence.annotations.*;

import javax.persistence.*;
import javax.persistence.Convert;

/**
 * Created by rodrigo on 20/11/17.
 */
@Entity
@Table(name = "country")
public class Country {


    private String code;
    private String name;
    private Continent continent;
    private String region;
    private Float surfaceArea;
    private Integer yearOfIndependence;
    private Long population;
    private Integer lifeExpentancy;
    private Float gnp;
    private Float gnpOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private Long capital;
    private String code2;

    @Id
    @Column(name = "Code", length = 3)
    public String getCode() {
        return code;
    }

    @Column(name = "Name", length = 52)
    public String getName() {
        return name;
    }

    @Column(name = "Continent")
    @Convert(converter = ContinentConverter.class)
        public Continent getContinent() {
        return continent;
    }

    @Column(name = "Region",length = 26)
    public String getRegion() {
        return region;
    }

    @Column(name="SurfaceArea")
    public Float getSurfaceArea() {
        return surfaceArea;
    }

    @Column(name="IndepYear")
    public Integer getYearOfIndependence() {
        return yearOfIndependence;
    }

    @Column(name="Population")
    public Long getPopulation() {
        return population;
    }

    @Column(name="LifeExpectancy")
    public Integer getLifeExpentancy() {
        return lifeExpentancy;
    }

    @Column(name="GNP")
    public Float getGnp() {
        return gnp;
    }

    @Column(name="GNPOld")
    public Float getGnpOld() {
        return gnpOld;
    }

    @Column(name = "LocalName",length = 45)
    public String getLocalName() {
        return localName;
    }

    @Column(name = "GovernmentForm",length = 45)
    public String getGovernmentForm() {
        return governmentForm;
    }

    @Column(name = "HeadOfState",length = 60)
    public String getHeadOfState() {
        return headOfState;
    }

    @Column(name = "Capital")
    public Long getCapital() {
        return capital;
    }

    @Column(name = "Code2",length = 2)
    public String getCode2() {
        return code2;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSurfaceArea(Float surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public void setYearOfIndependence(Integer yearOfIndependence) {
        this.yearOfIndependence = yearOfIndependence;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public void setLifeExpentancy(Integer lifeExpentancy) {
        this.lifeExpentancy = lifeExpentancy;
    }

    public void setGnp(Float gnp) {
        this.gnp = gnp;
    }

    public void setGnpOld(Float gnpOld) {
        this.gnpOld = gnpOld;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public void setCapital(Long capital) {
        this.capital = capital;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

}

