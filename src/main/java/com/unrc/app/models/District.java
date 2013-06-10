package com.unrc.app.models;

import org.javalite.activejdbc.Model;

public class District extends Model {

    static {
        validatePresenceOf("name", "city_id");
    }
    
    public String toString(){
    
        return getString("name");
    }
}