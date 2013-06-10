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
     * @param city_id value of city id
     * @param dst_id value of district id
     * @param bt_id value of building type id
     * @param maxPrice max prace value
     * @param owr_id value of owner id
     * @param sale true if a building is for sale
     * @param rental true if buildin is for rental
     * @return
     */
    public static List<Building> searchAll(String city_id, String dst_id, String bt_id, String maxPrice, String owr_id, String sale, String rental) {
        String query = "";

        if (city_id != null) {
            query += ("city_id = " + new Integer(city_id));
        }
        if (dst_id != null) {
            query += (" && district_id = " + new Integer(dst_id));
        }

        if (bt_id != null) {
            query += (" && building_type_id = " + new Integer(bt_id));
        }

        if (maxPrice.compareTo("") != 0) {
            query += (" && price <= " + new Integer(maxPrice));
        }

        if (owr_id != null) {
            query += (" && owner_id = " + new Integer(owr_id));
        }

        if (sale != null) {
            query += (" && sale = " + true);
        }

        if (rental != null) {
            query += (" && rental = " + true);
        }

        query = query.startsWith(" &&") ? query.substring(3) : query;

//        System.out.println(query);

        return BuildingController.listSelect(query);
    }

    /**
     *
     * @param city name of city
     * @return list of buildings in a city
     */
    public static List<Building> searchForCity(String city) {
        return BuildingController.listSelect("city_id = ?", CityController.getId(city));
    }

    /**
     *
     * @param d name of district
     * @return list of buildings in a district
     */
    public static List<Building> searchForDistrict(String d) {
        return BuildingController.listSelect("district_id = ?", DistrictController.getId(d));
    }

    /**
     *
     * @param bt type of building
     * @return list of buildings of the same type
     */
    public static List<Building> searchForBuildingType(String bt) {
        return BuildingController.listSelect("building_type_id = ?", BuildingTypeController.getId(bt));
    }

    /**
     *
     * @param maxPrice max price value
     * @return list of buildings with lower price of maxPrice value
     */
    public static List<Building> searchForMaxPrice(int maxPrice) {
        return BuildingController.listSelect("price <= ?", maxPrice);
    }

    /**
     *
     * @param name owner's name
     * @return list of buildings of the same owner
     */
    public static List<Building> searchForOwner(String name) {
        return BuildingController.listSelect("owner_id = ?", OwnerController.getId(name));
    }

    /**
     *
     * @param value 1 if building is for sale
     * @return list of buildings for sale
     */
    public static List<Building> searchToSale(int value) {
        return BuildingController.listSelect("sale = ?", value);
    }

    /**
     *
     * @param value 1 if building is for rental
     * @return list of buildings for rental
     */
    public static List<Building> searchToRental(int value) {
        return BuildingController.listSelect("rental = ?", value);
    }
}
