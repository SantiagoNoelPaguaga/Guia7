/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extraextra;

import entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author SantiagoPaguaga
 */
public class Ejercicio2ExtraExtra {

    /**
     * @param args the command line arguments
     * 2) Crea una clase "Estudiante" con
     * las propiedades "nombre", "edad" y "nota media". Crea un método para
     * calcular la nota media de un grupo de estudiantes y otro para mostrar por
     * pantalla los estudiantes que tienen una nota media superior.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos alumnos tiene el curso?");
        int total = sc.nextInt();
        Estudiante[] curso = new Estudiante[total];
        
        for (int i = 0; i < curso.length; i++) {
            Estudiante estudiante = new Estudiante();
            estudiante.pedirDatos();
            
            curso[i] = estudiante;
        }
        
        double media = calcularNotaMedia(curso);
        mostrarAlumnosMayorMedia(media, curso);
        
    }
    
    public static double calcularNotaMedia(Estudiante[] curso){
        double suma = 0;
        
        for (int i = 0; i < curso.length; i++) {
            suma += curso[i].getNotaMedia();
        }
        
        return suma/curso.length;
    }
    
    public static void mostrarAlumnosMayorMedia(double media, Estudiante[] curso){
        System.out.println("La nota media es: " + media);
        for (Estudiante estudiante  : curso) {
            if(estudiante.getNotaMedia() > media){
                System.out.println("El alumno " + estudiante.getNombre() + " superó la nota media con " + estudiante.getNotaMedia());
            }
        }
    }
    
}
