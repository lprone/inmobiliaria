/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unrc.app.html;

import com.unrc.app.models.*;
import java.util.List;

/**
 *
 * @author lprone
 */
public class HTML {

    public static String index() {
        return "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<title>Documento sin t&iacute;tulo</title>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "<p><a href=\"/search\">BuscarInmueble</a></p>\n"
                + "<p><a href=\"/saveCity\">InsertarCiudad</a></p>\n"
                //                + "<p><a href=\"/search\">InsertarDueño</a></p>\n"
                + "<p><a href=\"/cityList\">VerCiudades</a></p>\n"
                + "</body>\n"
                + "</html>";
    }

    public static String show(List l) {
        String ret;
        ret = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<title>Documento sin t&iacute;tulo</title>\n"
                + "</head>\n"
                + "<body>\n";
        for (Object o : l) {
            ret += "<p>" + o.toString() + "</p>\n";
        }

        ret += "</body>\n"
                + "</html>";
        return ret;

    }

    public static String saveCity() {
        String ret;
        ret = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<!-- TemplateBeginEditable name=\"doctitle\" -->\n"
                + "<title>Documento sin t&iacute;tulo</title>\n"
                + "<!-- TemplateEndEditable -->\n"
                + "<!-- TemplateBeginEditable name=\"head\" -->\n"
                + "<!-- TemplateEndEditable -->\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\n"
                + "  <label>\n"
                + "  <div align=\"center\">\n"
                + "  Nombre\n"
                + "  <input name=\"name\" type=\"text\" id=\"name\" />\n"
                + "  <br />\n"
                + "  <br />\n"
                + "  <input type=\"submit\" name=\"Submit\" value=\"Enviar\" />\n"
                + "  </div>\n"
                + "  </label>\n"
                + "</form>\n"
                + "</body>\n"
                + "</html>";
        return ret;
    }

    public static String saveOwner() {
        String ret;
        ret = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<title>Documento sin t&iacute;tulo</title>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\n"
                + "  <label>\n"
                + "  <div align=\"center\">name\n"
                + "    <input name=\"name\" type=\"text\" id=\"name\" />\n"
                + "  </div>\n"
                + "  </label>\n"
                + "  <p align=\"center\">street\n"
                + "    <label>\n"
                + "      <input name=\"street\" type=\"text\" id=\"street\" />\n"
                + "      </label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>number\n"
                + "    <input type=\"text\" name=\"textfield\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label></label>\n"
                + "    <select name=\"select4\">\n"
                + "      <option value=\"1\">Centro</option>\n"
                + "      <option value=\"2\">Alberdi</option>\n"
                + "      <option value=\"3\">Universidad</option>\n"
                + "      <option value=\"4\">Banda Norte</option>\n"
                + "    </select>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>\n"
                + "    <select name=\"select3\">\n"
                + "      <option value=\"1\">Rio Cuarto</option>\n"
                + "      <option value=\"2\">Cordoba</option>\n"
                + "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>email\n"
                + "    <input type=\"text\" name=\"textfield2\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>\n"
                + "    <input name=\"save\" type=\"submit\" id=\"save\" value=\"Enviar\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "</form>\n"
                + "</body>\n"
                + "</html>";

        return ret;
    }

    public static String publish() {
        return "";
    }

    public static String search(List<City> cities, List<District> districts, List<Owner> owners, List<BuildingType> buildingTypes) {
        String ret;
        ret = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<title>Documento sin t&iacute;tulo</title>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "<form id=\"Buscar\" name=\"Buscar\" method=\"get\" action=\"\">\n"
                + "  <label></label>\n"
                + "  <p align=\"center\">\n"
                + "    <label>city\n"
                + "    <select name=\"city_id\" id=\"city_id\">\n";
        for (City c : cities) {
            ret += "<option value=\"" + c.getString("id") + "\">" + c.getString("name") + "</option>";
        }

        ret += "    </select>\n"
                + "    </label>\n"
                + "</p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>distict\n"
                + "    <select name=\"district_id\" id=\"district_id\">\n";
        for (District d : districts) {
            ret += "<option value=\"" + d.getString("id") + "\">" + d.getString("name") + "</option>";
        }

        ret += "    </select>\n"
                + "  </label></p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>building Type\n"
                + "    <select name=\"building_type_id\" id=\"building_type_id\">\n";
        for (BuildingType b : buildingTypes) {
            ret += "<option value=\"" + b.getString("id") + "\">" + b.getString("type") + "</option>";
        }
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>maxPrice\n"
                + "    <input type=\"text\" name=\"maxPrice\" />\n"
                + "    </label>\n"
                + "</p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>owner\n"
                + "    <select name=\"owner_id\" id=\"owner_id\">\n";
        for (Owner o : owners) {
            ret += "<option value=\"" + o.getString("id") + "\">" + o.getString("name") + "</option>";
        }
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>\n"
                + "    <input type=\"checkbox\" name=\"checkbox\" value=\"checkbox\" />\n"
                + "    sale</label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>\n"
                + "    <input type=\"checkbox\" name=\"checkbox2\" value=\"checkbox\" />\n"
                + "    rental</label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>\n"
                + "    <input name=\"search\" type=\"submit\" id=\"search\" />\n"
                + "    </label></p>\n"
                + "</form>\n"
                + "</body>\n"
                + "</html>";

        return ret;
    }
}
