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
    }

}
