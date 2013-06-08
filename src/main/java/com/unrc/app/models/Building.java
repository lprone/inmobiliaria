package com.unrc.app.models;

import org.javalite.activejdbc.Model;
import com.unrc.app.controllers.*;

public class Building extends Model {

    static {
        validatePresenceOf("building_type_id", "owner_id", "street", "number", "city_id", "district_id");
    }

    @Override
    public String toString() {
        return getString("id") + " - "
                + getString("building_type_id") + " - "
                + getString("owner_id") + " - "
                + getString("street") + " - "
                + getString("number") + " - "
                + getString("city_id") + " - "
                + getString("district_id") + " - "
                + getString("description") + " - "
                + getString("price") + " - "
                + getString("sale") + " - "
                + getString("rental");


    }
}