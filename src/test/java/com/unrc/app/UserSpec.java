package com.unrc.app;

import com.unrc.app.controllers.UserController;
import com.unrc.app.db.DB;
import com.unrc.app.models.User;        

import org.javalite.activejdbc.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.javalite.test.jspec.JSpec.the;
import static org.junit.Assert.assertEquals;

public class UserSpec {

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

        User user = new User();

        //check errors
        the(user).shouldNotBe("valid");
        the(user.errors().get("first_name")).shouldBeEqual("value is missing");
        the(user.errors().get("last_name")).shouldBeEqual("value is missing");

        //set missing values
        user.set("first_name", "John", "last_name", "Doe");

        //all is good:
        the(user).shouldBe("valid");
    }

    @Test
    public void testGetUserId() {
        assertEquals(UserController.getId("Lucas", "Prone"), 1);
        assertEquals(UserController.getId("", ""), -1);        
    }
}
