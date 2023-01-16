package PasoPorReferencia;

import org.cursoUniversidadJava.Persona;

/**
 *
 * @author noelia
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        
        persona1.nombre =  "Juan";
        System.out.println("persona1 = " + persona1.nombre);
        cambiaValor(persona1);
        
    }
    
    public static void cambiaValor(Persona persona){
        persona.nombre = "Carla";
        
    }
    
}
