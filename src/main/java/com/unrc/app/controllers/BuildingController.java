/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unrc.app.controllers;

import com.unrc.app.models.Adress;
import com.unrc.app.models.Building;
import java.util.List;

/**
 *
 * @author lprone
 */
public class BuildingController {

    /**
     *
     * @param a
     * @return
     */
    public static Building get(Adress a) {
        return Building.findById(getId(a));
    }

    /**
     *
     * @param tags
     * @param values
     * @return
     */
    public static int insert(String[] tags, String[] values) {
        try {
            Building aux = new Building();
            aux.set(tags, values);
            aux.saveIt();
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    /**
     *
     * @param id
     * @param tags
     * @param values
     * @return
     */
    public static int update(int id, String[] tags, String[] values) {
        try {
            Building e = Building.findFirst("id = ?", id);
            for (int i = 0; i < tags.length; i++) {
                e.set(tags[i], values[i]).saveIt();
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
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
            Building e = Building.findFirst("id = ?", id);
            e.delete();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /**
     *
     * @return
     */

    public static List<Building> listAll() {
        return Building.findAll();
    }

    /**
     *
     * @param tag
     * @param value
     * @return
     */
    public static List<Building> listSelect(String tag, int value) {
        return Building.find(tag + " = ?", value);
    }

    /**
     *
     * @param a
     * @return
     */
    public static int getId(Adress a) {
        try {
            return (Integer) (Building.findFirst("street = ? and number = ? and city_id = ? and district_id = ? ", a.getStreet(), a.getNumber(), a.getCity(), a.getDistrict()).get("id"));
        } catch (Exception e) {
            return -1;
        }
    }
}
