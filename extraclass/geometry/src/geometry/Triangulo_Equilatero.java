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
public class Triangulo_Equilatero {

    void PerimetroTriangulo_Equi() {
        Triangulo_Equilatero forma = new Triangulo_Equilatero();
        float perimetrotrianguloequi = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite el tamaño del lado");
        float ladotri = keyboard.nextFloat();

        if (ladotri <= 0) {
            System.out.println("Parametros Invalido");
            PerimetroTriangulo_Equi();
        } else {
            perimetrotrianguloequi = ladotri * 3;
            System.out.println("El perimetro del cuadrado es: " + perimetrotrianguloequi);

        }

    }

    void AreaTriangulo_Equi() {
        Triangulo_Equilatero forma = new Triangulo_Equilatero();
        float areatrianguloequi = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite el tamaño de la base");
        float basetri = keyboard.nextFloat();
        System.out.println("Digite la altura del triangulo");
        float heighttri = keyboard.nextFloat();

        if (basetri <= 0 || heighttri <= 0) {
            System.out.println("Parametros Invalido");
            AreaTriangulo_Equi();
        } else {
            areatrianguloequi = (basetri * heighttri) / 2;
            System.err.println("El area del triangulo equilatero es de: " + areatrianguloequi);
        }

    }

}
