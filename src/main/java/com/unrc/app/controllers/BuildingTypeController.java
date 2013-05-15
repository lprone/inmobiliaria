package com.unrc.app.controllers;

import com.unrc.app.models.BuildingType;
import com.unrc.app.models.Building;

import java.util.List;

/**
 *
 * @author gCoria
 */
public class BuildingTypeController {
    
    public static BuildingType get(String name){        
        return BuildingType.findById(getId(name));
    }

    public static int insert(String[] tags, String[] values) {
        try {
            BuildingType aux = new BuildingType();
            aux.set(tags, values);
            aux.saveIt();
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    public static int update(int id, String[] tags, String[] values) {
        try {
            BuildingType e = BuildingType.findFirst("id = ?", id);
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
            BuildingType e = BuildingType.findFirst("id = ?", id);
            e.delete();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static List<BuildingType> listAll() {
        return BuildingType.findAll();
    }
        
    public static List<BuildingType> listSelect(String tag, int value) {
        return BuildingType.find(tag + " = ?", value);
    }
    

    public static int getId(String name) {//arreglar = que el building
        try {
            return (Integer) (Building.findFirst("name = ? ", name).get("id"));
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
