package com.unrc.app;

import com.unrc.app.controllers.RealEstateController;
import com.unrc.app.models.RealEstate;

import org.javalite.activejdbc.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.javalite.test.jspec.JSpec.the;
import static org.junit.Assert.assertEquals;

public class RealEstateSpec {

    @Before
    public void before() {
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");
        Base.openTransaction();
    }

    @After
    public void after() {
        Base.rollbackTransaction();
        Base.close();
    }

    @Test
    public void shouldValidateMandatoryFields() {

        RealEstate inmo = new RealEstate();

        //check errors
        the(inmo).shouldNotBe("valid");
        the(inmo.errors().get("name")).shouldBeEqual("value is missing");

        //set missing values
        inmo.set("name", "myInmo");

        //all is good:
        the(inmo).shouldBe("valid");
    }

    @Test
    public void testGetInmobiliariaId() {
        assertEquals((RealEstateController.getId("myInmo")), 1);
        assertEquals((RealEstateController.getId("")), -1);
    }
}
