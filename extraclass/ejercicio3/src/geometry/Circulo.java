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
public class Circulo {

    void PerimetroCirculo() {
        Circulo forma = new Circulo();

        float perimetrocirculo = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("*****OPERACION PARA OBTENER PERIMETRO*****");
        System.out.println("Digite el radio del circulo: ");

        float radius = keyboard.nextFloat();
        if (radius < 0) {
            System.out.println("Ningun parametro puede ser negativo");
            forma.PerimetroCirculo();
        } else {
            perimetrocirculo = (float) ((2 * Math.PI) * radius);
            System.out.println("El perimetro del circulo es: " + perimetrocirculo);
        }

    }

    void AreaCirculo() {
        Circulo forma = new Circulo();
        float areacirculo = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("*****OPERACION PARA OBTENER AREA*****");
        System.out.print("Digite el radio del circulo");
        float radius = keyboard.nextFloat();

        if (radius < 0) {
            System.out.println("Ningun parametro puede ser negativo");
            forma.AreaCirculo();
        } else {
            areacirculo = (float) ((radius * radius) * Math.PI);
            System.out.println("El area del rectangulo es: " + areacirculo);
        }

    }

}
