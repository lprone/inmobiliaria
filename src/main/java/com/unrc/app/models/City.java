package com.unrc.app.models;

import org.javalite.activejdbc.Model;

public class City extends Model {

    static {
        validatePresenceOf("name");
    }

    @Override
    public String toString() {
        return getString("name");
    }
}