/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unrc.app.controllers;

import com.unrc.app.models.RealEstate;
import java.util.List;

/**
 *
 * @author lprone
 */
public class RealEstateController {

    public static int insert(String[] tags, String[] values) {
        try {
            RealEstate aux = new RealEstate();
            aux.set(tags, values);
            aux.saveIt();
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    public static int update(int id, String[] tags, String[] values) {
        try {
            RealEstate e = RealEstate.findFirst("id = ?", id);
            for (int i = 0; i < tags.length; i++) {
                e.set(tags[i], values[i]).saveIt();
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int delete(int id) {
        try {
            RealEstate e = RealEstate.findFirst("id = ?", id);
            e.delete();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static List<RealEstate> list() {
        return RealEstate.findAll();
    }

    public static int getId(String name) {
        try {
            return (Integer) (RealEstate.findFirst("name = ? ", name).get("id"));
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
