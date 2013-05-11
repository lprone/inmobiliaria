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

    private String street, district, city;
    private int number;

    public Adress(String street, int number, String district, String city) {
        this.street = street;
        this.number = number;
        this.district = district;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getDistrict() {
        return district;
    }

    public String getCity() {
        return city;
    }
}
