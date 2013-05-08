package com.unrc.app;

import com.unrc.app.models.Inmobiliaria;

import org.javalite.activejdbc.Base;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.javalite.test.jspec.JSpec.the;
import static org.junit.Assert.assertEquals;

public class InmobiliariaSpec {

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

        Inmobiliaria inmo = new Inmobiliaria();

        //check errors
        the(inmo).shouldNotBe("valid");
        the(inmo.errors().get( "nombre")).shouldBeEqual("value is missing");
        
        //set missing values
        inmo.set("nombre", "myInmo");

        //all is good:
        the(inmo).shouldBe("valid");
    }

    @Test
    public void testGetInmobiliariaId() {   
        assertEquals((Inmobiliaria.getId("")), -1);
    }
}
