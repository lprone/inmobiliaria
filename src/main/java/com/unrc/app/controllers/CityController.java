/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unrc.app.controllers;

import com.unrc.app.models.City;
import java.util.List;

/**
 *
 * @author lprone
 */
public class CityController {

    public static int insert(String name) {
        try {
            City.createIt("name", name);
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    public static int update(int id, String name) {
        try {
            City e = City.findFirst("id = ?", id);
            e.set("name", name).saveIt();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int delete(int id) {
        try {
            City e = City.findFirst("id = ?", id);
            e.delete();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static List<City> list() {
        return City.findAll();
    }

    public static int getId(String name) {
        try {
            return (Integer) (City.findFirst("name = ? ", name).get("id"));
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
