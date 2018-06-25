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
public class PentagonoReg {

    void PerimetroPentagonoReg() {
        PentagonoReg forma = new PentagonoReg();
        float perimetropentag = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite el tamaño de los lados");
        float ladopentag = keyboard.nextFloat();

        if (ladopentag <= 0) {
            System.out.println("Parametros Invalidos");
            PerimetroPentagonoReg();
        } else {
            perimetropentag = ladopentag * 5;
            System.out.println("El perimetro del pentagono es de: " + perimetropentag);
        }
    }

    void AreaPentagonoReg() {
        PentagonoReg forma = new PentagonoReg();
        float areapentag = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite la longitud de los lados");
        float ladopentag = keyboard.nextFloat();
        System.out.println("Digite la longitud de la apotema");
        float apotemapentag = keyboard.nextFloat();

        if (ladopentag <= 0 || apotemapentag <= 0) {
            System.out.println("Parametros Invalidos");
        } else {
            areapentag = (5 * ladopentag * apotemapentag) / 2;
            System.out.println("El area del pentagono regular es: " + areapentag);
        }
    }

}
