
package arraysample;

import java.lang.reflect.Array;

public class ArraySample {

    
    public static void main(String[] args) {
       int Arreglo1[] = new int[10];
       System.out.println("Arreglo1:" );
       for (int i = 0; i< Arreglo1.length; i++) {
           Arreglo1[i] = (int)(Math.random()* 10);
           
       }
       for (int j = 0; j< Arreglo1.length; j++) {
           
           System.out.println( Arreglo1[j]);
           
       }
        
       int Arreglo2[] = new int[10];
       System.out.println("Arreglo2:" );
       for (int i = 0; i< Arreglo1.length; i++) {
           Arreglo2[i] = (int)(Math.random()* 10);
           
       }
       for (int j = 0; j< Arreglo2.length; j++) {
           
           System.out.println( Arreglo2[j]);
       }
  
    }
    
}
