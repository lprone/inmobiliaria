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
        Base.open(DB.driver, DB.url, DB.user, DB.password);
    	
    	get(new Route("/hello") {
         @Override
         public Object handle(Request request, Response response) {
            return "Hello World!";
         }//para ver el hello world en el buscador pongan http://localhost:4567/hello
      	});


    }
}
