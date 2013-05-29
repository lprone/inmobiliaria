/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unrc.app.controllers;

import com.mysql.jdbc.EscapeTokenizer;
import com.unrc.app.models.Owner;
import com.unrc.app.models.RealEstate;
import java.util.List;

/**
 *
 * @author lprone
 */
public class RealEstateController {

    /**
     *
     * @param name
     * @return
     */
    public static RealEstate get(String name) {
        return RealEstate.findById(getId(name));
    }

    /**
     *
     * @param tags
     * @param values
     * @return
     */
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

    /**
     *
     * @param id
     * @param tags
     * @param values
     * @return
     */
    public static int update(int id, String[] tags, String[] values) {
        try {
            RealEstate e = RealEstate.findFirst("id = ?", id);
            for (int i = 0; i < tags.length; i++) {
                e.set(tags[i], values[i]).saveIt();
            }
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
            RealEstate e = RealEstate.findFirst("id = ?", id);
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
    public static List<RealEstate> list() {
        return RealEstate.findAll();
    }

    /**
     *
     * @param e
     * @param o
     * @return
     */
    public static int assignOwner(RealEstate e, Owner o) {
        try {
            o.add(e);
            return 0;
        } catch (Exception ex) {
            return -1;
        }
    }

    /**
     *
     * @param tag
     * @param value
     * @return
     */
    public static List<RealEstate> listSelect(String tag, int value) {
        return RealEstate.find(tag + " = ?", value);
    }

    /**
     *
     * @param name
     * @return
     */
    public static int getId(String name) {
        try {
            return (Integer) (RealEstate.findFirst("name = ? ", name).get("id"));
        } catch (Exception e) {
            return -1;
        }
    }
}
