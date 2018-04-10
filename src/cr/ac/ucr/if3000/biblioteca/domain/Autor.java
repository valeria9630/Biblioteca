/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.domain;

import java.util.ArrayList;

/**
 *
 * @author daniela
 */
public class Autor extends Persona{
    
    private ArrayList<Catalogo> listaObrasEscritas;

    public Autor() {
    }

    public Autor(String nombreUnico, String contraseña, String nombreCompleto, String tipoIdentificacion, String identificacion) {
        super(nombreUnico, contraseña, nombreCompleto, tipoIdentificacion, identificacion);
    }
    

    public Autor(ArrayList<Catalogo> listaObrasEscritas, String nombreUnico, String contraseña, String nombreCompleto, String tipoIdentificacion, String identificacion) {
        super(nombreUnico, contraseña, nombreCompleto, tipoIdentificacion, identificacion);
        this.listaObrasEscritas = listaObrasEscritas;
    }

     
    public ArrayList<Catalogo> getListaObrasEscritas() {
        return listaObrasEscritas;
    }

    public void setListaObrasEscritas(ArrayList<Catalogo> listaObrasEscritas) {
        this.listaObrasEscritas = listaObrasEscritas;
    }


    public String toString() {
        return getNombreUnico();
    }

    
    
}
