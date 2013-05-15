/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unrc.app.controllers;

import com.unrc.app.models.Building;
import java.util.List;

/**
 *
 * @author lprone
 */
public class BuildingController {
    
    public static Building get(String name){        
        return Building.findById(getId(name));
    }

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

    public static List<Building> listAll() {
        return Building.findAll();
    }
        
    public static List<Building> listSelect(String tag, int value) {
        return Building.find(tag + " = ?", value);
    }
    

    public static int getId(String name) {//arreglar no tiene name
        try {
            return (Integer) (Building.findFirst("name = ? ", name).get("id"));
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
