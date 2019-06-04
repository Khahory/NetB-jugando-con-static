
package paquete1;


public class Clase1 {

   private static String aaa = "primera frase";

public static int sumar(int n1, int n2){
    int sumar = n1+n2;
    return sumar;
}
   
   
   
    public static void main(String args[]){
        Clase1 obj1 = new Clase1();
        Clase1 obj2 = new Clase1();
        Clase1 obj3 = new Clase1();
        Clase1 obj4 = new Clase1();
        Clase1 obj5 = new Clase1();
        Clase1 obj6 = new Clase1();
        
      // obj2.aaa = "segunda frase";
      // obj3.aaa = "tercera frase";
     //  obj4.aaa = "cuarta frase";
      // obj5.aaa = "quinta frase";
      // obj6.aaa = "sexta frase";
        
        
        System.out.println(obj1.aaa);
        System.out.println(obj2.aaa);
        System.out.println(obj3.aaa);
        System.out.println(obj4.aaa);
        System.out.println(obj5.aaa);
        System.out.println(obj6.aaa);
        
        
        System.out.println(Clase1.sumar(4, 5));
        
    }
}
