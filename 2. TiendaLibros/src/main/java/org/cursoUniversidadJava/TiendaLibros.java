package org.cursoUniversidadJava;

import java.util.Scanner;

public class TiendaLibros {
    public static void main(String[] args) {
        String nombre;
        int id;
        double precio;
        boolean envioGratuito;

        Scanner consola = new Scanner(System.in);

        System.out.println("Proporciona el nombre:");
        nombre = consola.nextLine();

        System.out.println("Proporciona el id: ");
        id = Integer.parseInt(consola.nextLine());

        System.out.println("Proporciona el precio:");
        precio = Double.parseDouble(consola.nextLine());

        System.out.println("Proporciona el envio gratuito:");
        envioGratuito = Boolean.parseBoolean(consola.nextLine());

        System.out.println(nombre + " #" + id);

        System.out.println("Precio: $" + precio);
        System.out.println("Envio gratuito: " + envioGratuito);
    }
}