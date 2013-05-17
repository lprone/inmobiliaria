package com.unrc.app.controllers;

import com.unrc.app.models.BuildingType;

import java.util.List;

/**
 *
 * @author gCoria
 */
public class BuildingTypeController {

    /**
     *
     * @param type
     * @return
     */
    public static BuildingType get(String type) {
        return BuildingType.findById(getId(type));
    }

    /**
     *
     * @param tags
     * @param values
     * @return
     */
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

    /**
     *
     * @param id
     * @param tags
     * @param values
     * @return
     */
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

    /**
     *
     * @param id
     * @return
     */
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

    /**
     *
     * @return
     */
    public static List<BuildingType> listAll() {
        return BuildingType.findAll();
    }

    /**
     *
     * @param tag
     * @param value
     * @return
     */
    public static List<BuildingType> listSelect(String tag, int value) {
        return BuildingType.find(tag + " = ?", value);
    }

    /**
     *
     * @param type
     * @return
     */
    public static int getId(String type) {
        try {
            return (Integer) (BuildingType.findFirst("type = ? ", type).get("id"));
        } catch (Exception e) {
            return -1;
        }
    }
}
