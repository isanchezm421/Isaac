/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class Menus {

    public static void main(String[] args) {

        boolean salir = false;

        while (salir != true) {
            Cuadrado cuadrado = new Cuadrado();
            Circulo circulo = new Circulo();
            Rectangulo rectangulo = new Rectangulo();
            Triangulo_Equilatero trianguloequi = new Triangulo_Equilatero();
            Triangulo_Isosceles trianguloiso = new Triangulo_Isosceles();
            PentagonoReg pentagonoreg = new PentagonoReg();

            Scanner sc = new Scanner(System.in);
            System.out.println("* * * * * * * MENU * * * * * * * ");
            System.out.println("1. OBTENER PERIMETRO");
            System.out.println("");
            System.out.println("2. OBTENER AREA");
            System.out.println("");
            System.out.println("3. SALIR");
            System.out.println("");
            System.out.println("* * * * * * * MENU * * * * * * *");

            System.out.println("Digite la accion que desea realizar");
            int accion = sc.nextInt();

            if (accion == 1) {
                System.out.println("* * * * * * * PERIMETRO * * * * * * * ");
                System.out.println("1. CIRCULO");
                System.out.println("");
                System.out.println("2. CUADRADO");
                System.out.println("");
                System.out.println("3. RECTANGULO");
                System.out.println("");
                System.out.println("4. Triangulo EQUILATERO");
                System.out.println("");
                System.out.println("5. Triangulo ISOSCELES");
                System.out.println("");
                System.out.println("6. PENTAGONO REGULAR");
                System.out.println("");
                System.out.println("* * * * * * * PERIMETRO * * * * * * *");
                System.out.println("Seleccione su figura");
                int figura = sc.nextInt();
                if (figura > 6 || figura < 0) {
                    System.out.println("Opcion Invalida");
                } else if (figura == 1) {
                    circulo.PerimetroCirculo();
                } else if (figura == 2) {
                    cuadrado.PerimetroCuadrado();

                } else if (figura == 3) {
                    rectangulo.PerimetroRectangulo();
                } else if (figura == 4) {
                    trianguloequi.PerimetroTriangulo_Equi();

                } else if (figura == 5) {
                    trianguloiso.PerimetroTriangulo_Isosceles();
                } else if (figura == 6) {
                    pentagonoreg.PerimetroPentagonoReg();

                }

            } else if (accion == 2) {
                System.out.println("* * * * * * * AREA * * * * * * * ");
                System.out.println("1. CIRCULO");
                System.out.println("");
                System.out.println("2. CUADRADO");
                System.out.println("");
                System.out.println("3. RECTANGULO");
                System.out.println("");
                System.out.println("4. Triangulo EQUILATERO");
                System.out.println("");
                System.out.println("5. Triangulo ISOSCELES");
                System.out.println("");
                System.out.println("6. PENTAGONO REGULAR");
                System.out.println("");
                System.out.println("* * * * * * * AREA * * * * * * *");
                System.out.println("Seleccione su figura");
                int figura = sc.nextInt();

                if (figura > 6 || figura < 0) {
                    System.out.println("Opcion Invalida");
                } else if (figura == 1) {
                    circulo.AreaCirculo();
                } else if (figura == 2) {
                    cuadrado.AreaCuadrado();

                } else if (figura == 3) {
                    rectangulo.AreaRectangulo();
                } else if (figura == 4) {
                    trianguloequi.AreaTriangulo_Equi();

                } else if (figura == 5) {
                    trianguloiso.AreaTriangulo_Isosceles();
                } else if (figura == 6) {
                    pentagonoreg.AreaPentagonoReg();

                }

            } else if (accion == 3) {
                System.out.println("¡Adios!");
                break;
            }

        }
    }

}
