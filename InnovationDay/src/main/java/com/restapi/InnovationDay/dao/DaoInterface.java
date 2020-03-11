package com.restapi.InnovationDay.dao;


import com.restapi.InnovationDay.entity.City;
import java.util.List;

public interface DaoInterface {

    public List<City> getAllCities();
    public City getCitiesById(Long cityId);

}
