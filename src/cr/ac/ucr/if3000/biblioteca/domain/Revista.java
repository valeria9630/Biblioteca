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
public class Revista extends Catalogo {

    private String issn;
    private String edicion;

    public Revista() {
        this.issn = issn;
        this.edicion = edicion;
    }

    public Revista(String issn, String edicion) {
        this.issn = issn;
        this.edicion = edicion;
    }

    public Revista(String issn, String edicion, String titulo, String fechaIngreso, Autor autor) {
        super(titulo, fechaIngreso, autor);
        this.issn = issn;
        this.edicion = edicion;
    }

<<<<<<< HEAD

=======
>>>>>>> 86ed7e761789edf39fddbf73b85e7b7056125a76
    public Revista(String issn, String edicion, String titulo, String fechaIngreso, Autor autor, int codigoCatalogo) {
        super(titulo, fechaIngreso, autor, codigoCatalogo);
        this.issn = issn;
        this.edicion = edicion;
    }
<<<<<<< HEAD
    
=======

>>>>>>> 86ed7e761789edf39fddbf73b85e7b7056125a76
    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

<<<<<<< HEAD

=======
>>>>>>> 86ed7e761789edf39fddbf73b85e7b7056125a76
    @Override
    public String toString() {
        return "Revista{" + "issn=" + issn + ", edicion=" + edicion + '}';
    }

    public String mostrar2() {
        return "Titulon:" + getTitulo() + "\n" + "FechaIngreso:" + getFechaIngreso() + "\n" + "Autor:" + getAutor().getNombreUnico() + "\n"
                + "ISSN:" + getIssn() + "\n" + "Edicion:" + getEdicion();
    }
<<<<<<< HEAD
    
=======
>>>>>>> 86ed7e761789edf39fddbf73b85e7b7056125a76

}
