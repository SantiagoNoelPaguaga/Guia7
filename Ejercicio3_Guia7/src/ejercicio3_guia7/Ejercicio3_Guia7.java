/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_guia7;

import entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author SantiagoPaguaga
 * Crear una clase llamada Operacion que tenga como
 * atributos privados numero1 y numero2. A continuación, se deben crear los
 * siguientes métodos: a) Método constructor con todos los atributos pasados por
 * parámetro. b) Método constructor sin los atributos pasados por parámetro. c)
 * Métodos get y set. d) Método para crearOperacion(): que le pide al usuario
 * los dos números y los guarda en los atributos del objeto. e) Método sumar():
 * calcular la suma de los números y devolver el resultado al main. f) Método
 * restar(): calcular la resta de los números y devolver el resultado al main g)
 * Método multiplicar(): primero valida que no se haga una multiplicación por
 * cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa
 * al usuario el error. Si no, se hace la multiplicación y se devuelve el
 * resultado al main h) Método dividir(): primero valida que no se haga una
 * división por cero, si fuera a pasar una división por cero, el método devuelve
 * 0 y se le informa al usuario el error se le informa al usuario. Si no, se
 * hace la división y se devuelve el resultado al main.
 */
public class Ejercicio3_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = sc.nextInt();
        
        Operacion op = new Operacion(num1, num2);
        
        System.out.println("La suma de los números es: " + op.sumar());
        System.out.println("La resta de los números es: " + op.restar());
        if(op.multiplicar() == 0){
            System.out.println("Error al multiplicar uno de los valores es cero");
        } else {
            System.out.println("La multiplicación de los números es: " + op.multiplicar());
        }
        
        if(op.getNum2() == 0){
            System.out.println("Error al dividir el divisor es cero");
        } else {
            System.out.println("La división de los números es: " + op.dividir());
        }
    }
    
//    public static Operacion crearOperacion(double num1, double num2){
//        Operacion op = new Operacion(num1, num2);
//        return op;
//    }
}
