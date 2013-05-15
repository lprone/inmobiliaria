package com.unrc.app;

import com.unrc.app.controllers.*;
import com.unrc.app.models.*;
import java.util.ArrayList;
import java.util.List;

import org.javalite.activejdbc.Base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Inmo {

    public static void main(String[] args) {
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");

        System.out.println(RealEstateController.list());

        System.out.println(UserController.list());

        System.out.println(CityController.list());
        
        System.out.println(OwnerController.list());
        
        System.out.println(OwnerController.get("Lucas"));
        
        RealEstateController.assignOwner(RealEstateController.get("myInmo"), OwnerController.get("Lucas"));

        System.out.println(DistrictController.listSelect("city_id", 1));
    }
}
