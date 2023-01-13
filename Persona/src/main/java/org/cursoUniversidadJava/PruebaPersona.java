package org.cursoUniversidadJava;

public class PruebaPersona {

    public static void main(String[] args) {

        //Constructor
        Persona persona1 = new Persona();
        persona1.nombre="Juan";
        persona1.apellido="Perez";
        persona1.desplegarInformacion();

        Persona persona2 = new Persona();
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);

        persona2.nombre="Marcos";
        persona2.apellido="Lopez";
        persona2.desplegarInformacion();





    }
}
