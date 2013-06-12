package com.unrc.app.models;

import org.javalite.activejdbc.Model;
import com.unrc.app.controllers.*;

public class Building extends Model {

    static {
        validatePresenceOf("building_type_id", "owner_id", "street", "number", "city_id", "district_id");
    }

    @Override
    public String toString() {
        return    "Tipo: "+getString("building_type_id") + " - "
                +"Duenio: "+ getString("owner_id") + " - "
                +"Calle: " + getString("street") + " - "
                +"Numero: "+ getString("number") + " - "
                +"Ciudad: "+ getString("city_id") + " - "
                +"Barrio: "+ getString("district_id") + " - "
                +"Descripcion: "+ getString("description") + " - "
                +"Precio: "+ getString("price") + " - "
                +"En venta: "+ getString("sale") + " - "
                +"Se alquila: "+ getString("rental");


    }
}