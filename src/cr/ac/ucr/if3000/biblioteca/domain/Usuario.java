/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.domain;

import cr.ac.ucr.if3000.biblioteca.domain.Catalogo;
import java.util.ArrayList;

/**
 *
 * @author daniela
 */
public class Usuario extends Persona{
    
    private ArrayList<Catalogo> listaObrasPrestadas;

    public Usuario() {
    }
    
       public Usuario(ArrayList<Catalogo> listaObrasPrestadas, String nombreUnico, String contraseña, String nombreCompleto, String tipoIdentificacion, String identificacion) {
        super(nombreUnico, contraseña, nombreCompleto, tipoIdentificacion, identificacion);
        this.listaObrasPrestadas = listaObrasPrestadas;
    }

    public ArrayList<Catalogo> getListaObrasPrestadas() {
        return listaObrasPrestadas;
    }

    public void setListaObrasPrestadas(ArrayList<Catalogo> listaObrasPrestadas) {
        this.listaObrasPrestadas = listaObrasPrestadas;
    }

    public String toString() {
        return "Lector{" + "listaObrasPrestadas=" + listaObrasPrestadas + '}';
    }
       
       
    
}