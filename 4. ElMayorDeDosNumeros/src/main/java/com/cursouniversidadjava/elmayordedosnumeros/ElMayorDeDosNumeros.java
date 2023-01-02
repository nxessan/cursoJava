package com.cursouniversidadjava.elmayordedosnumeros;

import java.util.Scanner;

/**
 *
 * @author Noelia
 */
public class ElMayorDeDosNumeros {

    public static void main(String[] args) {
        
        int numero1, numero2;
        
        Scanner sC = new Scanner (System.in);
        System.out.println("Proporciona el numero1:");
        numero1 = sC.nextInt();
        
        System.out.println("Proporciona el numero2:");
        numero2 = sC.nextInt();
        
        var numeroMayor = (numero1 > numero2) ? numero1 :  numero2; 
        System.out.println("El número mayor es: ");
        System.out.println(numeroMayor);
    }
}
