/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.domain;

import java.io.PrintStream;
import static java.lang.Boolean.TRUE;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class PruebasVale {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Autor autor = new Autor("a", "a", "a", "a", "a") {
        };
        Autor autor1 = new Autor("a", "b", "b", "a", "a") {
        };

        biblioteca.agregarPersona(autor);
        biblioteca.agregarPersona(autor1);

        for (int i = 0; i < biblioteca.getPersonas().size(); i++) {
            System.out.println(biblioteca.getPersonas().get(i).toString());

        }
        System.out.println(biblioteca.buscarPersona(autor1));

        Catalogo libro = new Libro("ss", "s", "sss");
        biblioteca.agregarCatalogo(libro);

        Catalogo libro1 = new Libro("a", "a", "ad");

        biblioteca.agregarCatalogo(libro1);

        System.out.println("Libro" + biblioteca.getCatalogos().get(0));

        System.out.println("Libro1" + biblioteca.getCatalogos().get(1));

        Prestamo prestamo = new Prestamo(0, autor1, "2-3", "3-4");
        Prestamo prestamo1 = new Prestamo(0, autor1, "2-3", "3-4");

        biblioteca.registrarPrestamo(libro, prestamo);
        biblioteca.registrarPrestamo(libro1, prestamo1);

        System.out.println("Prestamo" + biblioteca.getCatalogos().get(0).getPrestamo());

        System.out.println("Prestamo1" + biblioteca.getCatalogos().get(1).getPrestamo());

        System.out.println("Estado libro1" + biblioteca.getCatalogos().get(1).getPrestamo());
//        
        System.out.println("Libros prestados" + biblioteca.catalogoPrestado().get(0));
        System.out.println("Libros prestados" + biblioteca.catalogoPrestado().get(1));
        
        System.out.println("Ultimo Codigo prestamo" + biblioteca.getCodigoPrestamo());

        System.out.println(biblioteca.buscarLibroPorCodigo(0));

        biblioteca.devolverCatalogo(libro);
        System.out.println("Libros prestados" + biblioteca.catalogoPrestado().get(0));

    }

}
