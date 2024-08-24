/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Sofía
 */
public class CirculoTest {
    public static void main (String[] args){
        Circulo circulo1 = new Circulo ();
        double area1 = circulo1.getArea();
        System.out.println("El radio del circulo 1 es: "+circulo1.getRadio()+"\nEl área del círculo 1 es: " + area1);
        
        Circulo circulo2 = new Circulo(6.55);
        double area2=circulo2.getArea();
        System.out.println("El radio del circulo 2 es: "+circulo2.getRadio()+"\nEl área del círculo 2 es: " + area2);
        
        
    }
}
