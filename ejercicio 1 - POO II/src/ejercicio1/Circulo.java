/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.lang.*;
/**
 *
 * @author Sofía
 */
public class Circulo {
    private double radio;
    private String color;

    // Constructor por defecto con valores predeterminados
    public Circulo() {
        this.radio = 12.5;
        this.color = "azul";
    }

    // Constructor parametrizado
    public Circulo(double radio) {
        this.radio = radio;
        this.color = "azul";
    }

    public double getRadio() {
        return radio;
    }
    public double getArea() {
        return Math.PI * radio * radio;
    }
}