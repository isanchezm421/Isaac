/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class CapaChasis {

    Scanner sc = new Scanner(System.in);

    void Chasis() {
        CapaChasis chasis = new CapaChasis();
        System.out.println("Digite la longitud que desee para el cuerpo del carro: ");
        int length = sc.nextInt();
        if (length <= 0) {
            System.out.println("Parametros Invalidos");
            chasis.Chasis();
        } else {
            for (int i = 0; i <= length; i++) {
                if (i == 0) {
                    System.out.print("|");
                } else if (i != 0) {
                    if (length >= 12) {
                        System.out.print("");

                    } else if (i == -1) {
                        System.out.print("\"");
                    }
                }
            }
        }
    }
}
