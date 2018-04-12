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
<<<<<<< HEAD
    private static String identificacion;
=======
<<<<<<< HEAD
    private static String identificacionPersonaActiva;
=======
>>>>>>> a402110397bf3ed0a1c9ad42500ce11198e564d1
>>>>>>> 53e4d064574faf6cd94b12620b0dbf70813eaa11

    public Biblioteca() {

    }

    public Biblioteca(ArrayList<Persona> personas, ArrayList<Catalogo> catalogos) {
        this.personas = personas;
        this.catalogos = catalogos;
<<<<<<< HEAD

    }

    public static String getIdentificacion() {
        return identificacion;
    }

    public static void setIdentificacion(String identificacion) {
        Biblioteca.identificacion = identificacion;
=======
<<<<<<< HEAD

    }

    public static String getIdentificacionPersonaActiva() {
        return identificacionPersonaActiva;
    }

    public static void setIdentificacionPersonaActiva(String identificacionPersonaActiva) {
        Biblioteca.identificacionPersonaActiva = identificacionPersonaActiva;
=======
>>>>>>> a402110397bf3ed0a1c9ad42500ce11198e564d1
>>>>>>> 53e4d064574faf6cd94b12620b0dbf70813eaa11
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

<<<<<<< HEAD
    public boolean validarContraseña(String contraseña) {
        boolean validarContraseña = false;
         String contraseñaTemp= contraseña;
     
         String contraseñaEncriptada = DigestUtils.md5Hex(contraseña);
         System.out.println(contraseñaEncriptada);
=======
<<<<<<< HEAD
    public boolean validarContraseña(String contraseña) {
        boolean validarContraseña = false;
        String contraseñaTemp = contraseña;

        String contraseñaEncriptada = DigestUtils.md5Hex(contraseña);
        System.out.println(contraseñaEncriptada);
>>>>>>> 53e4d064574faf6cd94b12620b0dbf70813eaa11
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

<<<<<<< HEAD
=======
=======
>>>>>>> a402110397bf3ed0a1c9ad42500ce11198e564d1
>>>>>>> 53e4d064574faf6cd94b12620b0dbf70813eaa11
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

    public Autor buscaAutorPorNombreUnico(String nombreCompleto) {

        for (int i = 0; i < personas.size(); i++) {
            Persona persona = personas.get(i);
            if (nombreCompleto.equalsIgnoreCase(persona.getNombreUnico())) {
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

    public String buscaCatalogoPorCodigo(int codigo) {
        Libro catalogo1 = null;
        Revista catalogo2 = null;
        Periodico catalogo3 = null;
        Tesis catalogo4 = null;
        Memoria catalogo5 = null;
        Otros catalogo6 = null;

        String result = "";
        for (int i = 0; i < catalogos.size(); i++) {
            Catalogo catalogoTemp = catalogos.get(i);
            if (catalogoTemp.getCodigoCatalogo() == codigo) {
                if (catalogoTemp instanceof Libro) {
                    catalogo1 = (Libro) catalogoTemp;
                    result = catalogo1.mostrar1();
                } else if (catalogoTemp instanceof Revista) {
                    catalogo2 = (Revista) catalogoTemp;
                    result = catalogo2.mostrar2();
                } else if (catalogoTemp instanceof Periodico) {
                    catalogo3 = (Periodico) catalogoTemp;
                    result = catalogo3.mostrar3();
                } else if (catalogoTemp instanceof Tesis) {
                    catalogo4 = (Tesis) catalogoTemp;
                    result = catalogo4.mostrar4();
                } else if (catalogoTemp instanceof Memoria) {
                    catalogo5 = (Memoria) catalogoTemp;
                    result = catalogo5.mostrar5();
                } else if (catalogoTemp instanceof Otros) {
                    catalogo6 = (Otros) catalogoTemp;
                    result = catalogo6.mostrar6();

                }
            }
        }
        return result;
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


    public int getUltimoCodigoCatalogo() {
        int ultimoCodigo = 1;
        ultimoCodigo = catalogos.size() + 1;

        return ultimoCodigo;
    }

<<<<<<< HEAD

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

    public static Date ParseFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }

=======
<<<<<<< HEAD
    public ArrayList listaObrasEscritas(Autor persona) {
        ArrayList listaObrasEscritas = new ArrayList();
        for (int i = 0; i < catalogos.size(); i++) {
            if (catalogos.get(i).getAutor().getIdentificacion().equalsIgnoreCase(persona.getIdentificacion())) {
                listaObrasEscritas.add(catalogos.get(i));

            }

        }
        return listaObrasEscritas;
    }
=======
>>>>>>> a402110397bf3ed0a1c9ad42500ce11198e564d1
>>>>>>> 53e4d064574faf6cd94b12620b0dbf70813eaa11
}
