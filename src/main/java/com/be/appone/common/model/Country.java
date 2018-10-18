package com.be.appone.common.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the countries database table.
 */
@Entity
@Table(name = "countries")
public class Country implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "country_id")
    private String countryId;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "region_id")
    private Integer regionId;

    public Country() {
    }

    public Country(String countryId, String countryName, Integer regionId) {
        super();
        this.countryId = countryId;
        this.countryName = countryName;
        this.regionId = regionId;
    }

    public String getCountryId() {
        return this.countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getRegionId() {
        return this.regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

}
