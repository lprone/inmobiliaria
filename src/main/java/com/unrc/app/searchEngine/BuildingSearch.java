/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unrc.app.searchEngine;

import com.unrc.app.controllers.*;
import com.unrc.app.models.Building;
import java.util.List;

/**
 *
 * @author lprone
 */
public class BuildingSearch {

    /**
     *
     * @param city
     * @return
     */
    public static List<Building> searchForCity(String city) {
        return BuildingController.listSelect("city_id", CityController.getId(city));
    }

    /**
     *
     * @param d
     * @return
     */
    public static List<Building> searchForDistrict(String d) {
        return BuildingController.listSelect("district_id", DistrictController.getId(d));
    }

    /**
     *
     * @param bt
     * @return
     */
    public static List<Building> searchForBuildingType(String bt) {
        return BuildingController.listSelect("building_type_id", BuildingTypeController.getId(bt));
    }

    /**
     *     
     * @param maxPrice
     * @return
     */
    public static List<Building> searchForPriceBetween(int maxPrice) {//implementa prone garca
        throw new UnsupportedOperationException("Not Implemented.");
    }

    /**
     *
     * @param name
     * @return
     */
    public static List<Building> searchForOwner(String name) {
        return BuildingController.listSelect("owner_id", OwnerController.getId(name));
    }

    /**
     *
     * @param value
     * @return
     */
    public static List<Building> searchToSale(int value) {
        return BuildingController.listSelect("sale", value);
    }

    /**
     *
     * @param value
     * @return
     */
    public static List<Building> searchToRent(int value) {
        return BuildingController.listSelect("rent", value);
    }
}
