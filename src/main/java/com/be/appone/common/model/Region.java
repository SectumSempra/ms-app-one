package com.be.appone.common.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the regions database table.
 */
@Entity
@Table(name = "regions")
public class Region implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "region_id")
    private Integer regionId;

    @Column(name = "region_name")
    private String regionName;

    public Region() {
    }

    public Region(Integer regionId, String regionName) {
        super();
        this.regionId = regionId;
        this.regionName = regionName;
    }

    public Integer getRegionId() {
        return this.regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return this.regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

}
