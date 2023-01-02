package org.cursoUniversidadJava;

import java.util.Scanner;

public class DetallesLibro {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Proporciona el titulo:");
        String titulo = consola.nextLine();
        System.out.println(" Proporciona el autor:");
        String autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}