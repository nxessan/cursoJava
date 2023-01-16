package Operaciones;

public class Aritmetica {
    
    //Atributos
    int a=0, b=0;
    
    public Aritmetica (){
        
    }
    
    public Aritmetica (int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
    //Metodos
    public void sumar() {
        int resultado = a + b;
        System.out.println("Resultado = " + resultado);
    }
    
    public int sumarConRetorno() {
        //int resultado = a + b;
        //return resultado;
        return a+b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        a = arg1;
        b = arg2;
        //return a + b;
        return sumarConRetorno();
    }
}
