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

    private static ArrayList<Persona> personas;
    private static ArrayList<Catalogo> catalogo;

    public Biblioteca() {
        this.personas = new ArrayList<>();
        this.catalogo = new ArrayList<>();
    }

    public Biblioteca(ArrayList<Persona> personas, ArrayList<Catalogo> catalogo) {
        this.personas = personas;
        this.catalogo = catalogo;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        Biblioteca.personas = personas;
    }

    public ArrayList<Catalogo> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Catalogo> catalogo) {
        Biblioteca.catalogo = catalogo;
    }

    public void agregarPersona(Persona persona) {
        if (personas.indexOf(persona) == -1) {
            personas.add(persona);

        }

    }

    public void modificarPersona(Persona persona, Persona personaModificada) {
        personas.set(personas.indexOf(persona), personaModificada);
    }

    public void borrarPersona(Persona persona) {

        personas.remove(persona);

    }

    public Persona buscarPersona(Object persona) {
        Persona persona1 = new Persona() {
        };

        persona1 = personas.get(personas.indexOf(persona));

        return persona1;
    }

}
