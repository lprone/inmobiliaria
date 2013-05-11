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

    private String calle, barrio, ciudad;
    private int altura;

    public Adress(String calle, int altura, String barrio, String ciudad) {
        this.calle = calle;
        this.altura = altura;
        this.barrio = barrio;
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public int getAltura() {
        return altura;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getCiudad() {
        return ciudad;
    }
}
