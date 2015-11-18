package com.oleg.tripcomposer.dao;


import com.oleg.tripcomposer.domain.Country;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class CountryDAOImpl implements CountryDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private static final Logger LOGGER = Logger.getLogger("Dao");

    public List getAll() {
        LOGGER.debug("Get all from DB");
        Query query = sessionFactory.getCurrentSession().createQuery("from Country");
        return query.list();
    }

    public void saveAll(List<Country> country) {
        LOGGER.debug("save countries to DB");
        for (Country country1: country) {
            sessionFactory.getCurrentSession().save(country1);
        }
    }
}
