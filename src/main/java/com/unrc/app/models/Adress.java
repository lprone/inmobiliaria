/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unrc.app.models;

/**
 *
 * @author lprone
 */
public class Adress {

    private String street ;
    private int number,district, city;

    /**
     * 
     * @param street
     * @param number
     * @param district
     * @param city 
     */
    public Adress(String street, int number, int district, int city) {
        this.street = street;
        this.number = number;
        this.district = district;
        this.city = city;
    }

    /**
     * 
     * @return 
     */
    public String getStreet() {
        return street;
    }

    /**
     * 
     * @return 
     */
    public int getNumber() {
        return number;
    }

    /**
     * 
     * @return 
     */
    public int getDistrict() {
        return district;
    }

    /**
     * 
     * @return 
     */
    public int getCity() {
        return city;
    }
}
