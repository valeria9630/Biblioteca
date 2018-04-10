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
     Autor autor = new Autor("a", "a", "a", "a", "a"){};
        System.out.println(autor.toString());
        
        
        biblioteca.agregarPersona(autor);
          
       
       
    }

}
