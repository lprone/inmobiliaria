/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unrc.app.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;

/**
 *
 * @author lprone
 */
@Table("owners_real_estates")
public class owners_real_estates extends Model {

    static {
        validatePresenceOf("owner_id", "real_estate_id");
    }
}
