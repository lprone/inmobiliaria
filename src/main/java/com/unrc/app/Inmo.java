package com.unrc.app;

import com.unrc.app.models.Inmobiliaria;

import org.javalite.activejdbc.Base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Inmo {

    public static void main(String[] args) {
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/inmoapp_development", "root", "root");

//        User e = new User();
//        e.set("email", "user@email.com");
//        e.set("first_name", "John");
//        e.set("last_name", "Doe");
//        e.saveIt();

//        for (User u : User.list()) {
//             System.out.println(u.toString());
//            
//        }

//        String[] tags = {"first_name", "last_name"};
//        String[] values = {"Lucas", "Prone"};
//
//        User.update(User.getId("John", "Doe"), tags, values);

//        String[] tags = {"nombre", "calle","altura", "barrio", "ciudad", "telefono", "email", "URLweb"};
//        String[] values = {"Lucas", "Prone"};
//
        
//        Inmobiliaria i = new Inmobiliaria();
//        i.set("nombre","myInmo");
//        i.saveIt();
        
//        System.out.println(Inmobiliaria.getId("myInmo"));

//        System.out.println(Inmobiliaria.list().toString());


    }
}
