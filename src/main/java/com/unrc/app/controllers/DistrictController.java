/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unrc.app.controllers;

import com.unrc.app.models.District;
import java.util.List;

/**
 *
 * @author lprone
 */
public class DistrictController {

    /**
     * 
     * @param tags
     * @param values
     * @return 
     */
    public static int insert(String[] tags, String[] values) {
        try {
            District aux = new District();
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
            District e = District.findFirst("id = ?", id);
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
            District e = District.findFirst("id = ?", id);
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
    public static List<District> list() {
        return District.findAll();
    }

    /**
     * 
     * @param tag
     * @param value
     * @return 
     */
    public static List<District> listSelect(String tag, int value) {
        return District.find(tag + " = ?", value);
    }

    /**
     * 
     * @param name
     * @return 
     */
    public static int getId(String name) {
        try {
            return (Integer) (District.findFirst("name = ? ", name).get("id"));
        } catch (Exception e) {
            return -1;
        }
    }
}
