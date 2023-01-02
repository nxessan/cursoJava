package com.cursouniversidadjava.sistemacalificaciones;

import java.util.Scanner;

/**
 *
 * @author Noelia
 */
public class SistemaCalificaciones {

    public static void main(String[] args) {
        Scanner sC = new Scanner(System.in);

        System.out.println("Proporciona un valor entre 0 y 10: ");
        int calificacion = sC.nextInt();

        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("A");
        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("B");
        } else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("C");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("D");
        } else if (calificacion >= 0 && calificacion < 6) {
            System.out.println("F");
        } else {
            System.out.println("Valor desconocido");
        }
    }
}
