package clases;

import java.util.ArrayList;
import java.util.Objects;
import utilidades.pedirDatos;

public class Libreria {

    public boolean comparar(ArrayList<Libro> libro, String isbn) {
        for (Libro ele : libro) {
            if (ele.getIsbn().equals(isbn)) {
                System.out.println(ele.equals(libro));
                return true;
            }
        }
        return false;
    }

    public void añadirUnidades(ArrayList<Libro> libro, int unidades) {
        for (Libro ele : libro) {
            if (ele.equals(libro)) {
                ele.setUnidades(ele.getUnidades() + unidades);
            }
        }
    }

    public void engadir(ArrayList<Libro> libro, String titulo, String autor, String isbn, float prezo, int unidades) {
        libro.add(crearLibro(libro, titulo, autor, isbn, prezo, unidades));
    }

    public Libro crearLibro(ArrayList<Libro> libros, String titulo, String autor, String isbn, float prezo, int unidades) {
        Libro libro = new Libro(titulo, autor, isbn, prezo, unidades);
        return libro;
    }

    public void vender(ArrayList<Libro> libro, String isbn) {
        if (libro.isEmpty()) {
            System.out.println("No hay libros disponibles");
        }
        for (Libro ele : libro) {
            if ((ele.getIsbn().equals(isbn)) && (ele.getUnidades() > 0)) {
                ele.setUnidades(ele.getUnidades() - 1);

            } else {
                System.out.println("No hay unidades");
            }

            break;
        }
    }

    public void amosar(ArrayList<Libro> libro) {
        System.out.println("----------------------------------------");

        if (libro.isEmpty()) {
            System.out.println("No hay libros disponibles");
        }
        for (Libro ele : libro) {
            System.out.println(ele);

        }
    }

    public void baixa(ArrayList<Libro> libro) {
        if (libro.isEmpty()) {
            System.out.println("No hay libros disponibles");
        }
        for (Libro ele : libro) {

            if (ele.getUnidades() == 0) {
                libro.remove(ele);
                break;
            }

        }
    }

    public void amosarLibro(ArrayList<Libro> libro, String isbn) {
        System.out.println("----------------------------------------");
        for (Libro ele : libro) {
            if (libro != null) {
                if (ele.getIsbn().equals(isbn)) {
                    System.out.println(ele.toString());
                }
            }
        }
    }

}
