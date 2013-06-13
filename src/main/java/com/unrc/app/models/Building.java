package com.unrc.app.models;

import org.javalite.activejdbc.Model;
import com.unrc.app.controllers.*;

public class Building extends Model {

    static {
        validatePresenceOf("building_type_id", "owner_id", "street", "number", "city_id", "district_id");
    }

    @Override
    public String toString() {
        return "Tipo: " + BuildingTypeController.get(new Integer(getString("building_type_id"))).getString("type") + " - "
                + "Duenio: " + OwnerController.get(new Integer(getString("owner_id"))).getString("name") + " - "
                + "Calle: " + getString("street") + " - "
                + "Numero: " + getString("number") + " - "
                + "Ciudad: " + CityController.get(new Integer(getString("city_id"))).getString("name") + " - "
                + "Barrio: " + DistrictController.get(new Integer(getString("district_id"))).getString("name") + " - "
                + "Descripcion: " + getString("description") + " - "
                + "Precio: " + getString("price") + " - "
                + "En venta: " + getString("sale") + " - "
                + "Se alquila: " + getString("rental");


    }
}