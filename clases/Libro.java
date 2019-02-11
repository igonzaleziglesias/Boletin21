package clases;

import java.util.Objects;

public class Libro implements Comparable {

    private String titulo, autor, isbn;
    private float prezo;
    private int unidades;

    public Libro(String titulo, String autor, String isbn, float prezo, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "\ntitulo: " + titulo + "\nautor: " + autor + "\nisbn: " + isbn + "\nprezo: " + prezo + " euros" + "\nunidades: " + unidades + " unidades";
    }

    @Override
    public int compareTo(Object o) {
        Libro a = (Libro) o;
        if (this.titulo.compareToIgnoreCase(a.titulo) > 0) {
            return 1;
        } else if (this.titulo.compareToIgnoreCase(a.titulo) < 0) {
            return -1;
        } else {
            return 0;
        }
    }

}
