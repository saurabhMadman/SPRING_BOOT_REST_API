package com.restapi.InnovationDay.dao;


import javax.persistence.EntityManager;

import com.restapi.InnovationDay.entity.City;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;


@Repository
public class DaoImplmentation implements DaoInterface {

    private EntityManager entityManager;

    public DaoImplmentation(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<City> getAllCities() {
        Session currentsession = entityManager.unwrap(Session.class);
        String sql ="from City";
        Query<City> query = currentsession.createQuery(sql,City.class).setFirstResult(15);
        List<City> cityreturnList = query.getResultList();
        return cityreturnList;
    }

    @Override
    public City getCitiesById(Long cityId) {
        Session currentSession = entityManager.unwrap(Session.class);
        String sql ="from City c where c.id =:cityId";
        return currentSession.createQuery(sql,City.class).setParameter("cityId",cityId).uniqueResult();
    }
}
