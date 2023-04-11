/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author SantiagoPaguaga
 */
public class Circunferencia {
    private double radio;

    public Circunferencia() {
        
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double area(){
        return Math.PI * (Math.pow(radio, 2)); 
    }
    
    public double perimetro(){
        return Math.PI * radio * 2; 
    }
}
