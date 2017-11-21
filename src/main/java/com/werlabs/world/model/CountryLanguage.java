package com.werlabs.world.model;

import javax.persistence.*;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * Created by rodrigo on 21/11/17.
 */
@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {


    @EmbeddedId
    private CountryLanguageId id;

    private Boolean isOfficial;

    private Float percentage;


    @Column(name = "IsOficcial")
    @Convert(converter = BooleanConverter.class)
    public Boolean getOfficial() {
        return isOfficial;
    }

    @Column(name = "Percentage")
    public Float getPercentage() {
        return percentage;
    }

    public void setOfficial(Boolean official) {
        isOfficial = official;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }

    public CountryLanguageId getId() {
        return id;
    }

    public void setId(CountryLanguageId id) {
        this.id = id;
    }
}
