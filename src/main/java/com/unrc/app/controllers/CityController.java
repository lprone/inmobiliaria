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

    /**
     *
     * @param name
     * @return
     */
    public static City get(String name) {
        return City.findById(getId(name));
    }

    /**
     *
     * @param name
     * @return
     */
    public static int insert(String name) {
        try {
            City.createIt("name", name);
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    /**
     *
     * @param id
     * @param name
     * @return
     */
    public static int update(int id, String name) {
        try {
            City e = City.findFirst("id = ?", id);
            e.set("name", name).saveIt();
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    /**
     *
     * @param id
     * @return
     */
    public static int delete(int id) {
        try {
            City e = City.findFirst("id = ?", id);
            e.delete();
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    /**
     *
     * @return
     */
    public static List<City> list() {
        return City.findAll();
    }

    /**
     *
     * @param name
     * @return
     */
    public static int getId(String name) {
        try {
            return (Integer) (City.findFirst("name = ? ", name).get("id"));
        } catch (Exception e) {
            return -1;
        }
    }
}
