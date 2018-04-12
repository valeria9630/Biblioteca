/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cr.ac.ucr.if3000.biblioteca.domain.Autor;
import cr.ac.ucr.if3000.biblioteca.domain.Biblioteca;
import cr.ac.ucr.if3000.biblioteca.domain.Catalogo;
import cr.ac.ucr.if3000.biblioteca.domain.Libro;
import cr.ac.ucr.if3000.biblioteca.domain.Persona;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniela
 */
public class testBiblioteca {
    
    public static Biblioteca biblioteca;
    
    public testBiblioteca() {
    }
     @Before
    public void setUpBeforeClass() {
        biblioteca = new Biblioteca();
    }
    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
  
//    
//    @After
//    public void tearDown() {
//    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void agregarCatalogoTest() {
        Autor Autor = new Autor("Arnoldo", "nada", "todo", "si", "no");
        Catalogo catalogoEsperadado = new Libro("fb", "fbvr", "dsfjbh", "efvkb", "kjdfbv", Autor);
        biblioteca.agregarCatalogo(catalogoEsperadado);
        Catalogo resultado =biblioteca.getCatalogos().get(0);
        assertEquals(catalogoEsperadado,resultado);
     }
     @Test
     public void agregarPersonaTest(){
         Persona personaEsperada = new Autor("dfv", "dfg", "snbdf", "Nacional", "sdf");
         biblioteca.agregarPersona(personaEsperada);
         Persona resultado = biblioteca.getPersonas().get(0);
         assertEquals(personaEsperada,resultado);
     }
     @Test
     public void ModificarPersonaTest(){
         Persona personaAnterior = new Autor("dv", "dscw", "dfv", "dfv", "sdc");
         biblioteca.agregarPersona(personaAnterior);
         Persona personaNueva = new Autor("Alonso", "marta", "Alonso Ramirez", "Nacional", "djkbv");
         biblioteca.modificarPersona(personaAnterior, personaNueva);
         Persona result = biblioteca.getPersonas().get(0);
         assertEquals(personaNueva,result);
     }
     
     @Test
     public void borrarPersona(){
         Persona persona = new Autor("dfv", "dfg", "snbdf", "Nacional", "sdf");
         biblioteca.agregarPersona(persona);
         biblioteca.borrarPersona(biblioteca.getPersonas().get(0));
         Persona result = biblioteca.getPersonas().get(0);
         assertEquals(result,null);
     }
     
     @Test
     public void borrarCatalogo(){
         Autor Autor = new Autor("Arnoldo", "nada", "todo", "si", "no");
         Catalogo catalogo = new Libro("dsv", "skdb", "sldv", "fhg", "jsdkhf", Autor);
         biblioteca.agregarCatalogo(catalogo);
         biblioteca.suprimirCatalogo(0);
         Catalogo catalogoEliminado = biblioteca.getCatalogos().get(0);
         assertEquals(catalogoEliminado,null);
         
     }
     
     
}
