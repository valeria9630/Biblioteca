/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.domain;

import java.util.ArrayList;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class Biblioteca {

    private ArrayList<Persona> personas;
    private ArrayList<Catalogo> catalogo;

    public Biblioteca() {
    }

    public Biblioteca(ArrayList<Persona> personas, ArrayList<Catalogo> catalogo) {
        this.personas = personas;
        this.catalogo = catalogo;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Catalogo> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Catalogo> catalogo) {
        this.catalogo = catalogo;
    }

    public void agregarPersona(Persona persona) {
        if (personas.indexOf(persona) != -1) {
            personas.add(persona);
        }
    }

}
