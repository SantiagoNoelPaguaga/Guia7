/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_guia7;

import entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author SantiagoPaguaga
 */
public class Ejercicio4_Guia7 {

    /**
     * @param args the command line arguments
     * 
     * Crear una clase Rectángulo que modele rectángulos por medio de un
     * atributo privado base y un atributo privado altura. La clase incluirá un
     * método para crear el rectángulo con los datos del Rectángulo dados por el
     * usuario. También incluirá un método para calcular la superficie del
     * rectángulo y un método para calcular el perímetro del rectángulo. Por
     * último, tendremos un método que dibujará el rectángulo mediante
     * asteriscos usando la base y la altura. Se deberán además definir los
     * métodos getters, setters y constructores correspondientes. Superficie =
     * base * altura / Perímetro = (base + altura) * 2.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Rectangulo rec = new Rectangulo();
        
        System.out.println("Ingrese la base");
        //rec.setBase(sc.nextInt());
        int base = sc.nextInt();
        System.out.println("Ingrese la altura");
        //rec.setAltura(sc.nextInt());
        int altura = sc.nextInt();
        
        Rectangulo rec = new Rectangulo(base, altura);
        
        System.out.println("El perímetro del rectángulo es: " + rec.perimetro());
        System.out.println("La superficie del rectángulo es: " + rec.superficie());
        rec.dibujarRectangulo();
    }
    
}
