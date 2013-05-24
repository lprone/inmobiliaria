package com.unrc.app;

import com.unrc.app.controllers.RealEstateController;
import com.unrc.app.db.DB;
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

        RealEstate aux = new RealEstate();

        //check errors
        the(aux).shouldNotBe("valid");
        the(aux.errors().get("name")).shouldBeEqual("value is missing");

        //set missing values
        aux.set("name", "myInmo");

        //all is good:
        the(aux).shouldBe("valid");
    }

    @Test
    public void testGetInmobiliariaId() {
        assertEquals( "No son iguales",(RealEstateController.getId("myInmo")), 1);
        assertEquals((RealEstateController.getId("")), -1);
    }
}
