/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

import java.util.Scanner;

/**
 *
 * @author Yopuesquienmás
 */
public class Cuadrado {

    void AreaCuadrado() {
        Cuadrado forma = new Cuadrado();
        float areacuadrado = 0;
        float perimetrocuadrado = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("*****OPERACION PARA OBTENER AREA*****");
        System.out.print("Digite el tamaño del lado de su cuadrado: ");
        float side = keyboard.nextFloat();

        if (side < 0) {
            System.out.println("Ningun lado puede ser negativo");
            forma.AreaCuadrado();
        } else {
            areacuadrado = side * side;
            System.out.println("El area del cuadrado es: " + areacuadrado);
        }

    }

    void PerimetroCuadrado() {
        Cuadrado forma = new Cuadrado();
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
        }

    }

}
