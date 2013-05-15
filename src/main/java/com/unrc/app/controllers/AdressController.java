/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unrc.app.controllers;

import com.unrc.app.models.Adress;

/**
 *
 * @author lprone
 */
public class AdressController {

    /**
     * 
     * @param a
     * @return 
     */
    public static String getStreet(Adress a) {
        return a.getStreet();
    }

    /**
     * 
     * @param a
     * @return 
     */
    public static int getDistrict(Adress a) {
        return a.getDistrict();
    }

    /**
     * 
     * @param a
     * @return 
     */
    public static int getCity(Adress a) {
        return a.getCity();
    }

    /**
     * 
     * @param a
     * @return 
     */
    public static int getNumber(Adress a) {
        return a.getNumber();
    }
}
