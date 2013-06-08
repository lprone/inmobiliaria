package com.unrc.app;

import com.unrc.app.controllers.*;
import com.unrc.app.models.*;
import com.unrc.app.db.DB;
import com.unrc.app.searchEngine.*;
import java.util.List;

import org.javalite.activejdbc.Base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.unrc.app.html.HTML;

import static spark.Spark.*;
import spark.*;

public class Inmo {

    public static void main(String[] args) {

//        Base.open(DB.driver, DB.url, DB.user, DB.password);
//        System.out.println(BuildingSearch.searchAll(null, null, null, 250000, "Lucas", -1, -1));

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
                String ret = OwnerController.get(new Integer(request.params(":id"))).toString();;
                Base.close();
                return ret;
            }//http://localhost:4567/owners/1
        });

        /**
         *
         */
        get(new Route("/ownersList") {
            @Override
            public Object handle(Request request, Response response) {

                Base.open(DB.driver, DB.url, DB.user, DB.password);
                String ret = "";
                for (Owner o : OwnerController.list()) {
                    ret += o.toString();
                }
                Base.close();
                return ret;
            }// http://localhost:4567/ownersList
        });


        /**
         *
         */
        get(new Route("/cityList") {
            @Override
            public Object handle(Request request, Response response) {
                Base.open(DB.driver, DB.url, DB.user, DB.password);
                String ret = HTML.show(CityController.list());
                Base.close();
                return ret;
            }// http://localhost:4567/cityList
        });

        /*
         * ---------------------------------------------------------------------
         */

        /**
         *
         */
        get(new Route("/index") {
            @Override
            public Object handle(Request request, Response response) {
                return HTML.index();
            }//para ver el hello world en el buscador pongan http://localhost:4567/index
        });

        /*
         * -------------------------------
         */

        /**
         *
         */
        post(new Route("/saveOwner") {
            @Override
            public Object handle(Request request, Response response) {
                Base.open(DB.driver, DB.url, DB.user, DB.password);
                String ret = HTML.saveCity();
                Base.close();
                return ret;
            }// http://localhost:4567/saveOwner
        });

        /*
         * -------------------------------
         */

        /**
         *
         */
        get(new Route("/saveCity") {
            @Override
            public Object handle(Request request, Response response) {
                Base.open(DB.driver, DB.url, DB.user, DB.password);
                String ret = HTML.saveCity();
                Base.close();
                return ret;
            }// http://localhost:4567/saveCity
        });

        /**
         *
         */
        post(new Route("/saveCity") {
            @Override
            public Object handle(Request request, Response response) {
                String nombre = request.queryParams("name");

                Base.open(DB.driver, DB.url, DB.user, DB.password);
                CityController.insert(nombre);
                Base.close();
                return "Ciudad agreada correctamente";
            }// http://localhost:4567/saveCity
        });

        /*
         * -------------------------------
         */

        /**
         *
         */
        get(new Route("/search") {
            @Override
            public Object handle(Request request, Response response) {
                Base.open(DB.driver, DB.url, DB.user, DB.password);
                String ret = "Sin resultados", op = request.queryParams("search");
                if (op == null) {
                    ret = HTML.search(CityController.list(), DistrictController.list(), OwnerController.list(), BuildingTypeController.listAll());
                } else {
                    String city_id = request.queryParams("city_id");
                    String district_id = request.queryParams("district_id");
                    String building_type_id = request.queryParams("building_type_id");
                    String owner_id = request.queryParams("owner_id");
                    String maxPrice = request.queryParams("maxPrice");
                    String sale = request.queryParams("sale");
                    String rental = request.queryParams("rental");
                    System.out.println(city_id + " " + district_id + " " + building_type_id + " " + owner_id + " " + maxPrice + " " + sale + " " + rental);
                    try {
                        ret = HTML.show(BuildingSearch.searchAll(city_id, district_id, building_type_id, maxPrice, owner_id, sale, rental));
                    } catch (Exception e) {
                    }

                }
                Base.close();
                return ret;
            }// http://localhost:4567/search
        });



    }
}
