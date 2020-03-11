package com.restapi.InnovationDay.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "city" , schema="world")
public class City {

    @Id
    @Column(name = "ID")
    private Long cityId;
    @Column(name = "Name")
    private String cityName;

    @Column(name = "CountryCode")
    private String countryCode;

    @Column(name = "district")
    private String district;
    @Column(name = "Population")
    private Long population;

    public City(){

    }

    public City(Long cityId, String cityName, String countryCode, String district, Long population) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                '}';
    }
}
