/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author SantiagoPaguaga
 * Crear una clase llamada Libro que contenga los
 * siguientes atributos: ISBN, Título, Autor, Número de páginas, y un
 * constructor con todos los atributos pasados por parámetro y un constructor
 * vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
 * luego informar mediante otro método el número de ISBN, el título, el autor
 * del libro y el número de páginas.
 */
public class Libro {
    private int isbn;
    private String autor;
    private String titulo;
    private int numPaginas;

    public Libro(int isbn, String autor, String titulo, int numPaginas) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
    }

    public Libro() {
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + ", numPaginas=" + numPaginas + '}';
    }
    
   
    
    
    
}
