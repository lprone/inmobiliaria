package com.unrc.app;

import com.unrc.app.controllers.CityController;
import com.unrc.app.db.DB;
import com.unrc.app.models.City;

import org.javalite.activejdbc.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.javalite.test.jspec.JSpec.the;
import static org.junit.Assert.assertEquals;

public class BuildingSearchSpec {

    @Before
    public void before() {
        Base.open(DB.driver, DB.url, DB.user, DB.password);
        Base.openTransaction();
    }

    @After
    public void after() {
        Base.rollbackTransaction();
        Base.close();
    }

    @Test
    public void testSearchForCity() {
    }

    @Test
    public void testSearchForDistrict() {
    }

    @Test
    public void testSearchForBuildingType() {
    }

    @Test
    public void testSearchForMaxPrice() {
    }

    @Test
    public void testSearchForOwner() {
    }

    @Test
    public void testSearchToSale() {
    }

    @Test
    public void testSearchToRental() {
    }
}
