/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.domain;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public abstract class Catalogo {
    private String titulo;
    private String fechaIngreso;
    private Autor autor;
    private int codigoCatalogo;
    private static int contador;

    public Catalogo() {
        this.codigoCatalogo = contador++;

    }

    public Catalogo(String titulo, String fechaIngreso, Autor autor) {
        this.codigoCatalogo = contador++;
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getCodigoCatalogo() {
        return codigoCatalogo;
    }

    public void setCodigoCatalogo(int codigoCatalogo) {
        this.codigoCatalogo = codigoCatalogo;
    }

   
    
    @Override
    public String toString() {
        return "Catalogo{" + "titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + ", autor=" + autor + '}';
    }

   
    
}
