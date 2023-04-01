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
public class Operacion {
    private double num1, num2;

    public Operacion() {
    }

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double sumar(){
        return num1 + num2;
    }
    
    public double restar(){
        return num1 - num2;
    }
    
    public double multiplicar(){
        if(num1 == 0 || num2 == 0){
            return 0;
        } else {
            return num1 * num2;
        }     
    }
    
     public double dividir(){
        if(num2 == 0){
            return 0;
        } else {
            return num1 / num2;
        }     
    }
}
