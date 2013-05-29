package com.unrc.app;

import com.unrc.app.controllers.*;
import com.unrc.app.models.*;
import com.unrc.app.db.DB;
import com.unrc.app.searchEngine.*;
import java.util.List;

import org.javalite.activejdbc.Base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.*;
import spark.*;

public class Inmo {

    public static void main(String[] args) {

        /**
         *
         */
        get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World!";
            }//para ver el hello world en el buscador pongan http://localhost:4567/hello
        });

        /**
         *
         */
        get(new Route("/owners/:id") {
            @Override
            public Object handle(Request request, Response response) {
                Base.open(DB.driver, DB.url, DB.user, DB.password);
                return OwnerController.get(new Integer(request.params(":id"))).toString();//                
            }//http://localhost:4567/owners/1
        });

        /**
         *
         */
        get(new Route("/ownersList") {
            @Override
            public Object handle(Request request, Response response) {
                Base.open(DB.driver, DB.url, DB.user, DB.password);
                return OwnerController.list();
            }// http://localhost:4567/ownersList
        });


        /**
         *
         */
        get(new Route("/cityList") {
            @Override
            public Object handle(Request request, Response response) {
                Base.open(DB.driver, DB.url, DB.user, DB.password);
                return CityController.list();
            }// http://localhost:4567/cityList
        });

    }
}
