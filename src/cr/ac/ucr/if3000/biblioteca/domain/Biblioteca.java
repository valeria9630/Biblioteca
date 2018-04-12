/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.apache.commons.codec.digest.DigestUtils;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class Biblioteca {

    private static ArrayList<Persona> personas = new ArrayList<Persona>();
    private static ArrayList<Catalogo> catalogos = new ArrayList<Catalogo>();
    private static String identificacionPersonaActiva;

    public Biblioteca() {

    }

    public Biblioteca(ArrayList<Persona> personas, ArrayList<Catalogo> catalogos) {
        this.personas = personas;
        this.catalogos = catalogos;

    }

    public static String getIdentificacionPersonaActiva() {
        return identificacionPersonaActiva;
    }

    public static void setIdentificacionPersonaActiva(String identificacionPersonaActiva) {
        Biblioteca.identificacionPersonaActiva = identificacionPersonaActiva;
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

    public boolean validarContraseña(String contraseña) {
        boolean validarContraseña = false;
        String contraseñaTemp = contraseña;

        String contraseñaEncriptada = DigestUtils.md5Hex(contraseña);
        System.out.println(contraseñaEncriptada);
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getContraseña().equalsIgnoreCase(DigestUtils.md5Hex(contraseña))) {
                validarContraseña = true;
            }
//          
        }
        return validarContraseña;

    }

    public boolean validarNombreUnico(String nombreUnico) {
        boolean validarNombreUnico = false;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNombreUnico().equalsIgnoreCase(nombreUnico)) {
                validarNombreUnico = true;
            }

        }
        return validarNombreUnico;

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
            if (catalogoTemp.getCodigoCatalogo() == codigo) {
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

    public void modificarCatalogo(Catalogo catalogo, Catalogo catalogoModificado) {
        for (int i = 0; i < catalogos.size(); i++) {
            Catalogo temp = catalogos.get(i);
            System.out.println("temp " + temp.getCodigoCatalogo() + " , modif " + catalogoModificado.getCodigoCatalogo());
            if (temp.getCodigoCatalogo() == catalogo.getCodigoCatalogo()) {
                catalogos.set(i, catalogoModificado);
                System.out.println("true");
            }
            System.out.println(catalogos.get(i).toString());
        }
    }

    public Catalogo buscarLibroPorCodigo(int codigoCatalogo) {
        Catalogo catalogo = new Catalogo() {
        };
        for (int i = 0; i < catalogos.size(); i++) {
            if (catalogos.get(i).getCodigoCatalogo() == codigoCatalogo) {
                catalogo = catalogos.get(i);
            }
        }
        return catalogo;
    }

    public Persona buscarPersona(Object persona) {
        Persona persona1 = new Persona() {
        };

        persona1 = personas.get(personas.indexOf(persona));

        return persona1;

    }

    public Persona buscarPersonaPorIdentificacion(String identificacion) {
        Persona personaEncontrada = new Persona() {
        };
        for (int i = 0; i < personas.size(); i++) {
            Persona persona = (Persona) personas.get(i);
            if (persona.getIdentificacion().equalsIgnoreCase(identificacion)) {
                personaEncontrada = persona;
            }

        }
        return personaEncontrada;
    }

    public Persona buscarPersonaPorNombreUnico(String nombreUnico) {
        Persona personaEncontrada = new Persona() {
        };
        for (int i = 0; i < personas.size(); i++) {
            Persona persona = (Persona) personas.get(i);
            if (persona.getNombreUnico().equalsIgnoreCase(nombreUnico)) {
                personaEncontrada = persona;
            }

        }
        return personaEncontrada;
    }

    public void registrarPrestamo(Catalogo catalogo, Prestamo prestamo) {

        catalogo.setPrestamo(prestamo);

    }

    public ArrayList catalogoPrestado() {
        ArrayList librosPrestados = new ArrayList();

        for (int i = 0; i < catalogos.size(); i++) {

            if (catalogos.get(i).getPrestamo() != null) {
                librosPrestados.add(catalogos.get(i));

            }
        }
        return librosPrestados;
    }

    public String getCodigoPrestamo() {
        String ultimoCodigo = "1";
        ultimoCodigo = String.valueOf(catalogoPrestado().size() + 1);

        return ultimoCodigo;
    }

    public void devolverCatalogo(Catalogo catalogo) {
        Prestamo prestamo = null;

        catalogo.setPrestamo(prestamo);

    }

    public ArrayList listadeUsuariosMorosos() {
        ArrayList listaUsuariosMorosos = new ArrayList();

        int fechaInicialDía;
        int fechaFinalDía;
        int fechaInicialMes;
        int fechaFinalMes;
        int fechaInicialAño;
        int fechaFinalAño;
        System.out.println("pasa");
        for (int i = 0; i < catalogos.size(); i++) {
            fechaInicialDía = Integer.parseInt(catalogos.get(i).getPrestamo().getFechaInicioPrestamo().substring(0, 1));
            fechaFinalDía = Integer.parseInt(catalogos.get(i).getPrestamo().getFechaDevoluciónInicial().substring(0, 1));
            fechaInicialMes = Integer.parseInt(catalogos.get(i).getPrestamo().getFechaInicioPrestamo().substring(3, 4));
            fechaFinalMes = Integer.parseInt(catalogos.get(i).getPrestamo().getFechaDevoluciónInicial().substring(3, 4));
            fechaInicialAño = Integer.parseInt(catalogos.get(i).getPrestamo().getFechaInicioPrestamo().substring(5, 6));
            fechaFinalAño = Integer.parseInt(catalogos.get(i).getPrestamo().getFechaDevoluciónInicial().substring(5, 6));

            System.out.println(fechaFinalDía);
            System.out.println(fechaFinalMes);
            System.out.println(fechaFinalMes);

        }
        return listaUsuariosMorosos;

    }

    public ArrayList listaObrasEscritas(Autor persona) {
        ArrayList listaObrasEscritas = new ArrayList();
        for (int i = 0; i < catalogos.size(); i++) {
            if (catalogos.get(i).getAutor().getIdentificacion().equalsIgnoreCase(persona.getIdentificacion())) {
                listaObrasEscritas.add(catalogos.get(i));

            }

        }
        return listaObrasEscritas;
    }
}
