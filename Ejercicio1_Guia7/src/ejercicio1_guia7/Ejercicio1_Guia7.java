/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia7;

import entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author SantiagoPaguaga
 * 
 */
public class Ejercicio1_Guia7 {

    /**
     * @param args the command line arguments
     * Crear una clase llamada Libro que
     * contenga los siguientes atributos: ISBN, Título, Autor, Número de
     * páginas, y un constructor con todos los atributos pasados por parámetro y
     * un constructor vacío. Crear un método para cargar un libro pidiendo los
     * datos al usuario y luego informar mediante otro método el número de ISBN,
     * el título, el autor del libro y el número de páginas.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ISBN");
        int isbn = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el titulo");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el autor");
        String autor = sc.nextLine();
        System.out.println("Ingrese el número de páginas");
        int numPaginas = sc.nextInt();
        
        Libro nuevoLibro = new Libro(isbn, autor, titulo, numPaginas);
        System.out.println(nuevoLibro);
        
    }
    
//    public static Libro generarLibro(int isbn, String autor, String titulo, int numPaginas){
//        Libro libro = new Libro(isbn, autor, titulo, numPaginas);
//        return libro;
//     }
     
    
}
