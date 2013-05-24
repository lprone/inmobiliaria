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

public class CitySpec {

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
    public void shouldValidateMandatoryFields() {

        City aux = new City();

        //check errors
        the(aux).shouldNotBe("valid");
        the(aux.errors().get("name")).shouldBeEqual("value is missing");

        //set missing values
        aux.set("name", "Rio Cuarto");

        //all is good:
        the(aux).shouldBe("valid");
    }

    @Test
    public void testGetId() {
        assertEquals("No son iguales",(CityController.getId("Rio Cuarto")), 1);
        assertEquals((CityController.getId("")), -1);
    }
}
