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

<<<<<<< HEAD
    private static ArrayList<Persona> personas = new ArrayList<Persona>();
    private static ArrayList<Catalogo> catalogos = new ArrayList<Catalogo>();

    public Biblioteca() {

=======
    private static ArrayList<Persona> personas = new ArrayList<>();
    ;
    private static ArrayList<Catalogo> catalogo;

    public Biblioteca() {
        this.personas = new ArrayList<>();
        this.catalogo = new ArrayList<>();
>>>>>>> 943eda06b1273246ab6bd5567856c76943688b0b
    }

    public Biblioteca(ArrayList<Persona> personas, ArrayList<Catalogo> catalogos) {
        this.personas = personas;
        this.catalogos = catalogos;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        Biblioteca.personas = personas;
    }

    public ArrayList<Catalogo> getCatalogos() {
        return catalogos;
    }

<<<<<<< HEAD
    public void setCatalogos(ArrayList<Catalogo> catalogos) {
        this.catalogos = catalogos;
    }

    public void agregarPersona(Persona persona) {

        personas.add(persona);
=======
    public void setCatalogo(ArrayList<Catalogo> catalogo) {
        Biblioteca.catalogo = catalogo;
    }

    public void agregarPersona(Persona persona) {
        if (personas.indexOf(persona) == -1) {
            personas.add(persona);

        }
>>>>>>> 943eda06b1273246ab6bd5567856c76943688b0b

    }

    public void modificarPersona(Persona persona, Persona personaModificada) {
        personas.set(personas.indexOf(persona), personaModificada);
    }

    public void borrarPersona(Persona persona) {

        personas.remove(persona);

    }

<<<<<<< HEAD
    public void agregarCatalogo(Catalogo catalogo) {
        if (!existeCatalogo(catalogo)) {
            catalogos.add(catalogo);
        }
    }

    public boolean existeCatalogo(Catalogo catalogo) {
        boolean existe = false;
        for (int i = 0; i < catalogos.size(); i++) {
            Catalogo catalogoTemp = catalogos.get(i);
            if (catalogoTemp.getCodigoCatalogo() == (catalogo.getCodigoCatalogo())) {
                existe = true;
            }

        }
        return existe;
    }

    public void suprimirCatalogo(int codigo) {
       
        for (int i = 0; i < catalogos.size(); i++) {
            Catalogo catalogoTemp = catalogos.get(i);
            if(catalogoTemp.getCodigoCatalogo()==codigo){
                catalogos.remove(i);
            }
        }
    }
    
    public Autor buscaAutorPorNombreUnico(String nombreUnico) {
        
        for (int i = 0; i < personas.size(); i++) {
         Persona persona = personas.get(i);
            if (nombreUnico.equalsIgnoreCase(persona.getNombreUnico())) {
                return (Autor) persona;
            }
        }
        return null;
=======
    public Persona buscarPersona(Object persona) {
        Persona persona1 = new Persona() {
        };

        persona1 = personas.get(personas.indexOf(persona));

        return persona1;
>>>>>>> 943eda06b1273246ab6bd5567856c76943688b0b
    }

}
