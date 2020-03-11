package com.restapi.InnovationDay.controller;

import com.restapi.InnovationDay.entity.City;
import com.restapi.InnovationDay.service.ServiceLayerImplementation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class ConsumerController {

    @Autowired
    ServiceLayerImplementation testService;

    @GetMapping(path="/city")
    public List<City> getCities(){
        List<City> cities = testService.findAllCities();
        return cities;
    }

    @GetMapping(path="/city/{id}")
    public City getCitiesById(@PathVariable Long id ){
       City city = testService.findAllCitiesById(id);
        return city;
    }
}
