package com.unrc.app.models;

import org.javalite.activejdbc.Model;

public class BuildingType extends Model {

    static {
        validatePresenceOf("building_type_id");
    }
}