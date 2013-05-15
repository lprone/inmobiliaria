/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unrc.app.controllers;

import com.unrc.app.models.Owner;
import java.util.List;

/**
 *
 * @author gCoria
 */
public class OwnerController {
    
    public static Owner get(String name){        
        return Owner.findById(getId(name));
    }

    public static int insert(String[] tags, String[] values) {
        try {
            Owner aux = new Owner();
            aux.set(tags, values);
            aux.saveIt();
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    public static int update(int id, String[] tags, String[] values) {
        try {
            Owner e = Owner.findFirst("id = ?", id);
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
            Owner e = Owner.findFirst("id = ?", id);
            e.delete();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static List<Owner> list() {
        return Owner.findAll();
    }

    public static List<Owner> listSelect(String tag, int value) {
        return Owner.find(tag + " = ?", value);
    }

    public static int getId(String name) {
        try {
            return (Integer) (Owner.findFirst("name = ? ", name).get("id"));
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
