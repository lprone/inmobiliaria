package com.unrc.app.models;

import org.javalite.activejdbc.Model;

public class Building extends Model {

    static {
        validatePresenceOf("building_type_id", "owner_id", "street", "number", "city_id", "district_id");
    }
}