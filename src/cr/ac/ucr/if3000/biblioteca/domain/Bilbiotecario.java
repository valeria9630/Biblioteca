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
public class Bilbiotecario extends Usuario {
    
    private ArrayList<Catalogo> listaCatalogo;
    private ArrayList<Usuario> listaUsuarios;

    public Bilbiotecario() {
    }

    public Bilbiotecario(String nombreUnico, String contraseña, String nombreCompleto, String tipoIdentificacion, String identificacion, ArrayList<Catalogo> listaCatalogo, ArrayList<Usuario> listaUsuarios) {
        super(nombreUnico, contraseña, nombreCompleto, tipoIdentificacion, identificacion);
        this.listaCatalogo = listaCatalogo;
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<Catalogo> getListaCatalogo() {
        return listaCatalogo;
    }

    public void setListaCatalogo(ArrayList<Catalogo> listaCatalogo) {
        this.listaCatalogo = listaCatalogo;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public String toString() {
        return "Bilbiotecario{" + "listaCatalogo=" + listaCatalogo + ", listaUsuarios=" + listaUsuarios + '}';
    }

    
 
}
