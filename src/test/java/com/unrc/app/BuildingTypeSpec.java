package com.unrc.app;

import com.unrc.app.controllers.BuildingTypeController;
import com.unrc.app.models.BuildingType;

import org.javalite.activejdbc.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.javalite.test.jspec.JSpec.the;
import static org.junit.Assert.assertEquals;

public class BuildingTypeSpec {

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

        BuildingType aux = new BuildingType();

        //check errors
        the(aux).shouldNotBe("valid");
        the(aux.errors().get("type")).shouldBeEqual("value is missing");

        //set missing values
        aux.set("type", "land");

        //all is good:
        the(aux).shouldBe("valid");
    }

    @Test
    public void testGetId() {
        assertEquals((BuildingTypeController.getId("land")), 1);
        assertEquals((BuildingTypeController.getId("")), -1);
    }
}
