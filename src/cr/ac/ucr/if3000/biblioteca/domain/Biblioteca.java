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


    private static ArrayList<Persona> personas = new ArrayList<Persona>();
    private static ArrayList<Catalogo> catalogos = new ArrayList<Catalogo>();

    public Biblioteca() {

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


    public void setCatalogos(ArrayList<Catalogo> catalogos) {
        this.catalogos = catalogos;
    }

    public void agregarPersona(Persona persona) {

        personas.add(persona);

    }

    public void modificarPersona(Persona persona, Persona personaModificada) {
        personas.set(personas.indexOf(persona), personaModificada);
    }

    public void borrarPersona(Persona persona) {

        personas.remove(persona);

    }


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


}
}
