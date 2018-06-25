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
public class Rectangulo {

    void PerimetroRectangulo() {
        Rectangulo forma = new Rectangulo();

        float perimetrorectangulo = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Seleccione la operacion que desee realizar (1 para sacar AREA, 2 para obtener perimetro)");

        System.out.println("*****OPERACION PARA OBTENER PERIMETRO*****");
        System.out.print("Digite la altura del rectangulo: ");
        float height = keyboard.nextFloat();
        System.out.print("Digite el ancho del rectangulo: ");
        float width = keyboard.nextFloat();

        if (height < 0 || width < 0) {
            System.out.println("Ningun lado puede ser negativo");
            forma.PerimetroRectangulo();
        } else {
            perimetrorectangulo = (2 * height) + (2 * width);
            System.out.println("El perimetro del rectangulo es: " + perimetrorectangulo);
        }
    }

    void AreaRectangulo() {
        Rectangulo forma = new Rectangulo();
        float arearectangulo = 0;

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

    }

}
