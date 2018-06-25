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
public class area {
    public float AreaCuadrado() {
        area forma = new area();
        float areacuadrado = 0;
        float perimetrocuadrado = 0;
        Scanner keyboard = new Scanner(System.in);
        
            System.out.println("*****OPERACION PARA OBTENER AREA*****");
            System.out.print("Digite el tamaño del lado de su cuadrado");
            float side = keyboard.nextFloat();
            
            if (side < 0) {
                System.out.println("Ningun lado puede ser negativo");
                forma.AreaCuadrado();
            } else {
                areacuadrado = side * side;
                System.out.println("El area del cuadrado es: " + areacuadrado);
            }
            return areacuadrado;
        }
       
        
        
        
        
        
    
    
    public float AreaCirculo() {
        area forma = new area();
        float areacirculo = 0;
        float perimetrotriangulo = 0;
        Scanner keyboard = new Scanner(System.in);
        
            System.out.println("*****OPERACION PARA OBTENER AREA*****");
            System.out.print("Digite el radio del circulo");
            float radius = keyboard.nextFloat();
            
            if (radius < 0) {
                System.out.println("Ningun lado puede ser negativo");
                forma.AreaCirculo();
            } else {
                areacirculo = (float) ((radius * radius)* Math.PI);
                System.out.println("El area del rectangulo es: " + areacirculo);
            }
            return areacirculo;
        }
       
    public float AreaRectangulo() {
        area forma = new area();
        float arearectangulo = 0;
        float perimetrorectangulo = 0;
        Scanner keyboard = new Scanner(System.in);
               
            System.out.println("*****OPERACION PARA OBTENER AREA*****");
            System.out.print("Digite la altura del rectangulo");
            float height = keyboard.nextFloat();
            System.out.print("Digite el ancho del rectangulo");
            float width = keyboard.nextFloat();
            
            if (height < 0 || width < 0) {
                System.out.println("Ningun lado puede ser negativo");
                forma.AreaRectangulo();
            } else {
                arearectangulo = height * width;
                System.out.println("El area del rectangulo es: " + arearectangulo);
            }
            return arearectangulo;
        } 
       
        
}



    
    
    


