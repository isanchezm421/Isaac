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
public class Triangulo_Isosceles {

    void PerimetroTriangulo_Isosceles() {
        Triangulo_Isosceles forma = new Triangulo_Isosceles();
        float perimetrotrianguloiso = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite el tamaño de los lados iguales");
        float ladotriigual = keyboard.nextFloat();
        System.out.println("Digite el tamaño del lado diferente");
        float ladotridiferente = keyboard.nextFloat();

        if (ladotriigual <= 0 || ladotridiferente <= 0) {
            System.out.println("Parametros Invalidos");
            PerimetroTriangulo_Isosceles();
        } else {
            perimetrotrianguloiso = (2 * ladotriigual) + ladotridiferente;
            System.out.println("El perimetro es igual a: " + perimetrotrianguloiso);
        }

    }

    void AreaTriangulo_Isosceles() {
        Triangulo_Isosceles forma = new Triangulo_Isosceles();
        float areatrianguloiso = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite el tamaño de la base");
        float basetri = keyboard.nextFloat();
        System.out.println("Digite la altura del triangulo");
        float heighttri = keyboard.nextFloat();

        if (basetri <= 0 || heighttri <= 0) {
            System.out.println("Parametros Invalido");
            AreaTriangulo_Isosceles();
        } else {
            areatrianguloiso = (basetri * heighttri) / 2;
            System.err.println("El area del triangulo equilatero es de: " + areatrianguloiso);
        }

    }

}
