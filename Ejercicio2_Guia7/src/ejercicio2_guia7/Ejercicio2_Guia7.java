/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia7;

import entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author SantiagoPaguaga
 */
public class Ejercicio2_Guia7 {

    /**
     * @param args the command line arguments
     * Declarar una clase llamada
     * Circunferencia que tenga como atributo privado el radio de tipo real. A
     * continuación, se deben crear los siguientes métodos: a) Método
     * constructor que inicialice el radio pasado como parámetro. b) Métodos get
     * y set para el atributo radio de la clase Circunferencia. c) Método para
     * crearCircunferencia(): que le pide el radio y lo guarda en el atributo
     * del objeto. d) Método area(): para calcular el área de la circunferencia
     * (Area=〖 π*radio〗^2). e) Método perimetro(): para calcular el perímetro
     * (Perimetro=2*π*radio).
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese el radio de la circunferencia");
       double radio = sc.nextDouble();
       Circunferencia nuevaCirc = new Circunferencia(radio);
       System.out.println("El área de la circunferencia es: " + nuevaCirc.area());
       System.out.println("El perímetro de la circunferencia es: " + nuevaCirc.perimetro());
    }
    
//    public static Circunferencia crearCircunferencia(double radio){
//        Circunferencia c = new Circunferencia(radio);
//        return c;
//    }
    
}
