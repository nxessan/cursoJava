package PasoPorValor;

/**
 *
 * @author noelia
 */
public class PasoPorValor {
    public static void main(String[] args) {
        int x=10;
        System.out.println("x = " + x);
        
        cambioValor(x);
        System.out.println("x = " + x);
    }
    
    public static void cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        
        arg1 = 20;        
    }
    
}
