package com.unrc.app;

import com.unrc.app.controllers.OwnerController;
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

        Owner owner = new Owner();

        //check errors
        the(owner).shouldNotBe("valid");
        the(owner.errors().get("name")).shouldBeEqual("value is missing");

        //set missing values
        owner.set("name", "owner");

        //all is good:
        the(owner).shouldBe("valid");
    }

    @Test
    public void testGetOwnerId() {
        assertEquals((OwnerController.getId("Lucas")), 1);
        assertEquals((OwnerController.getId("")), -1);
    }
}
