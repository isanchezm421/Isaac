
package split;

import java.util.Stack;
import java.util.StringTokenizer;


public class splirexercise {
    
   public static void main(String[] args) {
    String sTexto = "Hola como esta";
    StringTokenizer frase = new StringTokenizer(sTexto);
    Stack<String> pila = new Stack<>();
    while (frase.hasMoreTokens()) {
         pila.push(frase.nextToken());
}
    while (!pila.empty())
        System.out.print(pila.pop() + " ");
    }
}

