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
public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    
    
//    public Rectangulo crearRectangulo(double base, double altura){
//        Rectangulo r = new Rectangulo(base, altura);
//        return r;
//    }
    
    public int superficie(){
        return base * altura;
    }
    
    public int perimetro(){
        return (base + altura) * 2;
    }
    
    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            String aux = "";
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    aux += "* ";
                } else {
                    aux += "  ";
                }
            }
            System.out.println(aux);
        }
    }
}
