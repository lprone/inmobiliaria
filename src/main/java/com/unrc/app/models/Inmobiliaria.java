package com.unrc.app.models;

import java.util.List;
import org.javalite.activejdbc.Model;

public class Inmobiliaria extends Model {

    static {
        validatePresenceOf("nombre");
    }

    public static int insert(String[] tags, String[] values) {
        try {
            Inmobiliaria aux = new Inmobiliaria();
            aux.set(tags, values);
            aux.saveIt();
            return 0;
        } catch (Exception e) {
            return -1;
        }

    }

    public static int update(int id, String[] tags, String[] values) {
        try {
            Inmobiliaria e = Inmobiliaria.findFirst("id = ?", id);
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
            Inmobiliaria e = Inmobiliaria.findFirst("id = ?", id);
            e.delete();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }

    public static List<Inmobiliaria> list() {
        return Inmobiliaria.findAll();
    }

    public static int getId(String name) {
        try {
            return (Integer)(Inmobiliaria.findFirst("nombre = ? ", name).get("id"));
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }
}