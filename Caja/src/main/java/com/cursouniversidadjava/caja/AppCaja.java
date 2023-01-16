package com.cursouniversidadjava.caja;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class AppCaja {

    public static void main(String[] args) {

        //ATRIBUTOS
        int ancho=2;
        int alto=4;
        int profundo=6;

        //CONSTRUCTOR 1
        Caja miCaja = new Caja();
        
        //Asignar el valor de los atributos de este objeto a los de la clase:
        
        miCaja.ancho = ancho;
        miCaja.alto = alto;
        miCaja.profundo = profundo;
        
        miCaja.calcularVolumen();
        System.out.println("Resultado: " + miCaja.calcularVolumen());
        

        //CONSTRUCTOR SEGUNDO OBJETO
        Caja miCaja2 = new Caja(2, 4, 6);
        System.out.println("Resultado: " + miCaja2.calcularVolumen());
    }
}