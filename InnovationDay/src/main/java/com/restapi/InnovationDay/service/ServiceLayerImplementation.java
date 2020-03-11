package com.restapi.InnovationDay.service;

import com.restapi.InnovationDay.dao.DaoImplmentation;
import com.restapi.InnovationDay.entity.City;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceLayerImplementation {

    @Autowired
    DaoImplmentation daoImplmentation;

    @Transactional
    public List<City> findAllCities() {
        List<City> cities =daoImplmentation.getAllCities();
        return cities;
    }

    @Transactional
    public City findAllCitiesById(Long id) {
        City city = daoImplmentation.getCitiesById(id);
        return city;
    }
}
