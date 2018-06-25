/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimetrosyareas;

import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class perimetro {
    public float PerimetroCuadrado() {
        perimetro forma = new perimetro();
        float areacuadrado = 0;
        float perimetrocuadrado = 0;
        Scanner keyboard = new Scanner(System.in);
            System.out.println("*****OPERACION PARA OBTENER PERIMETRO*****");
            System.out.print("Digite el tamaño del lado de su cuadrado");
            float side = keyboard.nextFloat();
            
            if (side < 0) {
                System.out.println("Ningun lado puede ser negativo");
                forma.PerimetroCuadrado();
            } else {
                perimetrocuadrado = side * 4;
                System.out.println("El perimetro del cuadrado es: " + perimetrocuadrado);
            } return perimetrocuadrado;
     
    }
    
    public float PerimetroCirculo() {
        perimetro forma = new perimetro();
        
        float perimetrocirculo = 0;
        Scanner keyboard = new Scanner(System.in);
        
        
            System.out.println("*****OPERACION PARA OBTENER PERIMETRO*****");
            System.out.println("Digite el radio del circulo");
            
                float radius = keyboard.nextFloat();
                if (radius < 0) {
                    System.out.println("Ningun lado puede ser negativo");
                    forma.PerimetroCirculo();
                } else {
                    perimetrocirculo = (float) ((2* Math.PI) * radius);
                    System.out.println("El perimetro del circulo es: " + perimetrocirculo);
            }
         return perimetrocirculo;
       

 
}
    
 
public float PerimetroRectangulo() {
        perimetro forma = new perimetro();
        float arearectangulo = 0;
        float perimetrorectangulo = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Seleccione la operacion que desee realizar (1 para sacar AREA, 2 para obtener perimetro)");
        
            System.out.println("*****OPERACION PARA OBTENER PERIMETRO*****");
            System.out.print("Digite la altura del rectangulo");
            float height = keyboard.nextFloat();
            System.out.print("Digite el ancho del rectangulo");
            float width = keyboard.nextFloat();
            
            if (height < 0 || width < 0) {
                System.out.println("Ningun lado puede ser negativo");
                forma.PerimetroRectangulo();
            } else {
                perimetrorectangulo = (2*height) + (2*width);
                System.out.println("El perimetro del rectangulo es: " + perimetrorectangulo);
            } return perimetrorectangulo;
        }
       
        
        
        
        
        
}
    



