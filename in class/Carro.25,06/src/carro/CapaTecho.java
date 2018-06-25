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
public class CapaTecho {
    Scanner sc = new Scanner(System.in);
    void Techo() {
        CapaTecho techo = new CapaTecho();
        System.out.println("Digite la longitud que desee: ");
        int length = sc.nextInt();
        if (length <= 0) {
            System.out.println("Parametros Invalidos");
            techo.Techo();
        } else {
            
           for (int i = 0; i <= length; i++) {
            System.out.print("_");
        } 
        }
        
    }
}
