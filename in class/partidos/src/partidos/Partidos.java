
package partidos;

import java.util.Random;


public class Partidos {

  
       public static void main(String[] args) {
        Random random = new Random();
        for(int counter=1; counter<=8;counter++){
            System.out.println("Los resultados del grupo " + counter + " son");
            int resA;
            resA = 1+random.nextInt(4);
            int resB;
            resB = 1+random.nextInt(4);
            System.out.println("El resultado del partido A contra B fue " + "A " + resA + " - " + resB + " B");
            int resC;
            resC = 1+random.nextInt(4);
            int resD;
            resD = 1+random.nextInt(4);
            System.out.println("El resultado del partido C contra D fue " + "C " + resC + " - " + resD + " D");
            System.out.println(" ");

    
    


        
    }
    
}
