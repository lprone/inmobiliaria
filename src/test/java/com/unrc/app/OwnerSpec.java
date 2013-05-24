package com.unrc.app;

import com.unrc.app.controllers.OwnerController;
import com.unrc.app.db.DB;
import com.unrc.app.models.Owner;

import org.javalite.activejdbc.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.javalite.test.jspec.JSpec.the;
import static org.junit.Assert.assertEquals;

public class OwnerSpec {

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

        Owner aux = new Owner();

        //check errors
        the(aux).shouldNotBe("valid");
        the(aux.errors().get("name")).shouldBeEqual("value is missing");

        //set missing values
        aux.set("name", "owner");

        //all is good:
        the(aux).shouldBe("valid");
    }

    @Test
    public void testGetOwnerId() {
        assertEquals("No son iguales",(OwnerController.getId("Lucas")), 1);
        assertEquals((OwnerController.getId("")), -1);
    }
}
