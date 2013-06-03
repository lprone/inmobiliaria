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
     * @param d
     * @param bt
     * @param maxPrice
     * @param name
     * @param sale
     * @param rental
     * @return 
     */
    public static List<Building> searchAll(String city, String d, String bt, int maxPrice, String name, int sale, int rental) {
        String query = "";

        if (city != null) {
            query += ("city_id = " + CityController.getId(city));
        }
        if (d != null) {
            query += (" && district_id = " + DistrictController.getId(d));
        }

        if (bt != null) {
            query += (" && building_type_id = " + BuildingTypeController.getId(bt));
        }

        if (maxPrice >= 0) {
            query += (" && price <= " + maxPrice);
        }

        if (name != null) {
            query += (" && owner_id = " + OwnerController.getId(name));
        }

        if (sale != -1) {
            query += (" && sale = " + sale);
        }

        if (rental != -1) {
            query += (" && rental = " + rental);
        }

        query = query.startsWith(" &&") ? query.substring(3) : query;
        
        return BuildingController.listSelect(query);
    }

    /**
     *
     * @param city
     * @return
     */
    public static List<Building> searchForCity(String city) {
        return BuildingController.listSelect("city_id = ?", CityController.getId(city));
    }

    /**
     *
     * @param d
     * @return
     */
    public static List<Building> searchForDistrict(String d) {
        return BuildingController.listSelect("district_id = ?", DistrictController.getId(d));
    }

    /**
     *
     * @param bt
     * @return
     */
    public static List<Building> searchForBuildingType(String bt) {
        return BuildingController.listSelect("building_type_id = ?", BuildingTypeController.getId(bt));
    }

    /**
     *
     * @param maxPrice
     * @return
     */
    public static List<Building> searchForMaxPrice(int maxPrice) {
        return BuildingController.listSelect("price <= ?", maxPrice);
    }

    /**
     *
     * @param name
     * @return
     */
    public static List<Building> searchForOwner(String name) {
        return BuildingController.listSelect("owner_id = ?", OwnerController.getId(name));
    }

    /**
     *
     * @param value
     * @return
     */
    public static List<Building> searchToSale(int value) {
        return BuildingController.listSelect("sale = ?", value);
    }

    /**
     *
     * @param value
     * @return
     */
    public static List<Building> searchToRental(int value) {
        return BuildingController.listSelect("rental = ?", value);
    }
}
