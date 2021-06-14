/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Vianey
 */
public class Pdf {
    
    public int id_documento;
    public int folio;
    public String ruta_docum;
    public String ruta_cartsol;
    public String ruta_cartacep;
    
    
   
    
    
    public Pdf (int id_documento, int folio, String ruta_docum, String ruta_cartsol, String ruta_cartacep, String seleccionar){
        
        this.id_documento = id_documento;
        this.folio = folio;
        this.ruta_docum = ruta_docum;
        this.ruta_cartsol = ruta_cartsol;
        this.ruta_cartacep = ruta_cartacep;
    }

    /**
     * @return the id_documento
     */
    public int getId_documento() {
        return id_documento;
    }

    /**
     * @param id_documento the id_documento to set
     */
    public void setId_documento(int id_documento) {
        this.id_documento = id_documento;
    }

    /**
     * @return the folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }

    /**
     * @return the ruta_docum
     */
    public String getRuta_docum() {
        return ruta_docum;
    }

    /**
     * @param ruta_docum the ruta_docum to set
     */
    public void setRuta_docum(String ruta_docum) {
        this.ruta_docum = ruta_docum;
    }

    /**
     * @return the ruta_cartsol
     */
    public String getRuta_cartsol() {
        return ruta_cartsol;
    }

    /**
     * @param ruta_cartsol the ruta_cartsol to set
     */
    public void setRuta_cartsol(String ruta_cartsol) {
        this.ruta_cartsol = ruta_cartsol;
    }

    /**
     * @return the ruta_cartacep
     */
    public String getRuta_cartacep() {
        return ruta_cartacep;
    }

    /**
     * @param ruta_cartacep the ruta_cartacep to set
     */
    public void setRuta_cartacep(String ruta_cartacep) {
        this.ruta_cartacep = ruta_cartacep;
    }
}
        
        
        
        
        
        
   
