package com.cursouniversidadjava.Rectangulo;

import java.util.Scanner;

/**
 *
 * @author Noelia
 */
public class Rectangulo {

    public static void main(String[] args) {
        int alto, ancho;
        
        Scanner sC = new Scanner (System.in);
        
        System.out.println("Proporciona el alto: ");
        alto = sC.nextInt();
        System.out.println("Proporciona el ancho: ");
        ancho = sC.nextInt();
        
        int area = alto * ancho;
        System.out.println("Area = " + area);
        
        int perimetro = 2 * (alto + ancho);
        System.out.println("Perímetro = " + perimetro);
    }
}
