/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unrc.app.html;

import com.unrc.app.models.*;
import java.util.List;
import org.javalite.activejdbc.Model;

/**
 *
 * @author lprone
 */
public class HTML {

    /**
     *
     * @return html code of index page
     */
    public static String index() {
        return "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<title>Documento sin t&iacute;tulo</title>\n"
                + "<style type=\"text/css\">\n"
                + "<!--\n"
                + ".Estilo1 {font-family: \"comic Sans MS\"}\n"
                + "-->\n"
                + "</style>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "<h1 align=\"center\"><strong><span class=\"Estilo1\"><a href=\"/search\">BuscarInmueble</a></span></strong></h1>\n"
                + "<h1 align=\"center\" class=\"Estilo1\"><strong><a href=\"/saveCity\">InsertarCiudad</a></strong></h1>\n"
                + "<h1 align=\"center\" class=\"Estilo1\"><strong><a href=\"/saveOwner\">InsertarDuenio</a></strong></h1>\n"
                + "<h1 align=\"center\" class=\"Estilo1\"><strong> <a href=\"/saveBuilding\">InsertarInmueble</a></strong></h1>\n"
                + "<h1 align=\"center\" class=\"Estilo1\"><strong> <a href=\"/saveRealState\">InsertarInmobiliaria</a></strong></h1>\n"
                + "<h1 align=\"center\" class=\"Estilo1\"><strong> <a href=\"/cityList\">VerCiudades</a></strong></h1>\n"
                + "<h1 align=\"center\" class=\"Estilo1\"><strong> <a href=\"/ownersList\">VerDuenios</a></strong></h1>\n"
                + "<h1 align=\"center\" class=\"Estilo1\"><strong> <a href=\"/buildingsList\">VerInmuebles</a></strong></h1>\n"
                + "<h1 align=\"center\" class=\"Estilo1\"><strong> <a href=\"/realStateList\">VerInmobiliarias</a></strong></h1>\n"
                + "</body>\n"
                + "</html>";
    }

    /**
     *
     * @param l list with elements to show
     * @return html code for show elements in list
     */
    public static String show(List l) {
        String ret;
        ret = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<title>Listar</title>\n"
                + "</head>\n"
                + "<body>\n";
        for (Object o : l) {
            ret += "<p>" + o.toString() + "</p>\n";
        }

        ret += "</body>\n"
                + "</html>";
        return ret;

    }

    /**
     *
     * @param l list with values to set in combo row
     * @param id name of id column
     * @param value name of value column
     * @return html code for set values in fields of comboLists
     */
    private static String setFields(List l, String id, String value) {
        String ret = "";
        for (Object c : l) {
            ret += "<option value=\"" + ((Model) c).getString(id) + "\">" + ((Model) c).getString(value) + "</option>";
        }
        return ret;
    }

    /**
     *
     * @return html code for save a new city
     */
    public static String saveCity() {
        String ret;
        ret = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<!-- TemplateBeginEditable name=\"doctitle\" -->\n"
                + "<title>Guardar Ciudad</title>\n"
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

    /**
     *
     * @return html code for save a new owner
     */
    public static String saveOwner(List<City> cities, List<District> districts) {
        String ret;
        ret = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<title>Cargar Duenio</title>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\n"
                + "  <label>\n"
                + "  <div align=\"center\">Nombre\n"
                + "    <input name=\"name\" type=\"text\" id=\"name\" />\n"
                + "  </div>\n"
                + "  </label>\n"
                + "  <p align=\"center\">Calle\n"
                + "    <label>\n"
                + "      <input name=\"street\" type=\"text\" id=\"street\" />\n"
                + "      </label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>Numero\n"
                + "    <input name=\"number\" type=\"text\" id=\"number\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>Barrio </label>\n"
                + "    <select name=\"district_id\" id=\"district_id\">\n";
        ret += setFields(districts, "id", "name");
        ret += "    </select>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>Ciudad \n"
                + "    <select name=\"city_id\" id=\"city_id\">\n";
        ret += setFields(cities, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>Email\n"
                + "    <input name=\"mail\" type=\"text\" id=\"mail\" />\n"
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

    /**
     *
     * @param cities cities list
     * @param districts districts list
     * @param ownersowners list
     * @param buildingTypes building type list
     * @return html code for search form
     */
    public static String search(List<City> cities, List<District> districts, List<Owner> owners, List<BuildingType> buildingTypes) {
        String ret;
        ret = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<title>Buscar</title>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "<form id=\"Buscar\" name=\"Buscar\" method=\"get\" action=\"\">\n"
                + "  <label></label>\n"
                + "  <p align=\"center\">\n"
                + "    <label>city\n"
                + "    <select name=\"city_id\" id=\"city_id\">\n";
        ret += setFields(cities, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "</p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>distict\n"
                + "    <select name=\"district_id\" id=\"district_id\">\n";
        ret += setFields(districts, "id", "name");
        ret += "    </select>\n"
                + "  </label></p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>building Type\n"
                + "    <select name=\"building_type_id\" id=\"building_type_id\">\n";
        ret += setFields(buildingTypes, "id", "type");
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
        ret += setFields(owners, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>\n"
                + "    <input type=\"checkbox\" name=\"sale\" value=\"true\" />\n"
                + "    sale</label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>\n"
                + "    <input type=\"checkbox\" name=\"rental\" value=\"true\" />\n"
                + "    rental</label>\n"
                + "  </p>\n"
                + "  <p align=\"center\">\n"
                + "    <label>\n"
                + "    <input name=\"search\" type=\"submit\" id=\"search\" onclick=\"MM_goToURL('parent','/index');return document.MM_returnValue\"/>\n"
                + "    </label></p>\n"
                + "</form>\n"
                + "</body>\n"
                + "</html>";

        return ret;
    }

    /**
     *
     * @param cities cities list
     * @param districts districts list
     * @param owners owners list
     * @param buildingTypes building type list
     * @return html code for new building form
     */
    public static String saveBulding(List<City> cities, List<District> districts, List<Owner> owners, List<BuildingType> buildingTypes) {
        String ret = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<title>Insertar inmueble</title>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\n"
                + "  <label>Tipo de Inmueble\n"
                + "  <select name=\"building_type_id\" id=\"building_type_id\">\n";
        ret += setFields(buildingTypes, "id", "type");
        ret += "  </select>\n"
                + "  </label>\n"
                + "  <p>\n"
                + "    <label>Duenio\n"
                + "    <select name=\"owner_id\" id=\"owner_id\">\n";
        ret += setFields(owners, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Calle\n"
                + "    <input name=\"street\" type=\"text\" id=\"street\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Numero\n"
                + "    <input name=\"number\" type=\"text\" id=\"number\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Barrio\n"
                + "    <select name=\"district_id\" id=\"district_id\">\n";
        ret += setFields(districts, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Ciudad\n"
                + "    <select name=\"city_id\" id=\"city_id\">\n";
        ret += setFields(cities, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Descripcion\n"
                + "    <textarea name=\"description\" id=\"description\"></textarea>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Precio\n"
                + "    <input name=\"price\" type=\"text\" id=\"price\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>\n"
                + "    <input name=\"rental\" type=\"checkbox\" id=\"rental\" value=\"true\" />\n"
                + "    Alquiler</label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>\n"
                + "    <input name=\"sale\" type=\"checkbox\" id=\"sale\" value=\"true\" />\n"
                + "    Venta</label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>\n"
                + "    <input type=\"submit\" name=\"Submit\" value=\"Enviar\" />\n"
                + "    </label>\n"
                + "  </p>"
                + "</form>\n"
                + "</body>\n"
                + "</html>";

        return ret;
    }

    /**
     *
     * @param cities cities list
     * @param districts districts list
     * @param owners owners list
     * @return
     */
    public static String saveRealState(List<City> cities, List<District> districts, List<Owner> owners) {
        String ret = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                + "<head>\n"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n"
                + "<title>Nueva inmobiliaria</title>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "<form id=\"form1\" name=\"form1\" method=\"post\" action=\"\">\n"
                + "  <label>Nombre\n"
                + "  <input name=\"name\" type=\"text\" id=\"name\" />\n"
                + "  </label>\n"
                + "  <p>\n"
                + "    <label>Calle\n"
                + "    <input name=\"street\" type=\"text\" id=\"street\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Nro\n"
                + "    <input name=\"nro\" type=\"text\" id=\"nro\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Barrio\n"
                + "    <select name=\"district_id\" id=\"district_id\">\n";
        ret += setFields(districts, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Ciudad\n"
                + "    <select name=\"city_id\" id=\"city_id\">\n";
        ret += setFields(cities, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Telefono\n"
                + "    <input name=\"phone\" type=\"text\" id=\"phone\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Email\n"
                + "    <input name=\"mail\" type=\"text\" id=\"mail\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Web\n"
                + "    <input name=\"web\" type=\"text\" id=\"web\" />\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>Duenios\n"
                + "    <select name=\"owners\" size=\"5\" multiple=\"multiple\" id=\"owners\">\n";
        ret += setFields(owners, "id", "name");
        ret += "    </select>\n"
                + "    </label>\n"
                + "  </p>\n"
                + "  <p>\n"
                + "    <label>\n"
                + "    <input type=\"submit\" name=\"Submit\" value=\"Enviar\" />\n"
                + "    </label>\n"
                + "  </p>"
                + "</form>\n"
                + "</body>\n"
                + "</html>";
        return ret;
    }
}
