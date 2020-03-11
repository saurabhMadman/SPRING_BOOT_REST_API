package com.restapi.InnovationDay.service;

import com.restapi.InnovationDay.dao.DaoImplmentation;
import com.restapi.InnovationDay.entity.City;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TestServiceLayerImplementation {
    private List<City> citiesList;
    @Mock
    private City city;
    @Mock
    private DaoImplmentation daoImplmentation;
    @InjectMocks
    private  ServiceLayerImplementation  serviceLayerImplementation;
    @Before
    public void setup(){
        createList();
    }

    private void createList() {
        citiesList = new ArrayList<>();
        city.setCityName("Jaipur");
        city.setCountryCode("ABD");
        city.setDistrict("xyz");
        city.setPopulation(123141L);
        citiesList.add(city);
    }

    @Test
    public void testfindAllCities(){
        Mockito.when(daoImplmentation.getAllCities()).thenReturn(citiesList);
        List<City> list = serviceLayerImplementation.findAllCities();
        assertTrue(list.size()>0);
       // Mockito.verify(daoImplmentation.getAllArticles(),Mockito.times(1));
    }


}