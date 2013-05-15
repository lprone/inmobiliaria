package com.unrc.app;

import com.unrc.app.controllers.DistrictController;
import com.unrc.app.models.District;

import org.javalite.activejdbc.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.javalite.test.jspec.JSpec.the;
import static org.junit.Assert.assertEquals;

public class DistrictSpec {

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

        District d = new District();

        //check errors
        the(d).shouldNotBe("valid");
        the(d.errors().get("name")).shouldBeEqual("value is missing");
        the(d.errors().get("city_id")).shouldBeEqual("value is missing");

        //set missing values
        d.set("name", "Centro");
        d.set("city_id", "1");


        //all is good:
        the(d).shouldBe("valid");
    }

    @Test
    public void testGetInmobiliariaId() {
        assertEquals((DistrictController.getId("Centro")), 1);
        assertEquals((DistrictController.getId("")), -1);
    }
}
