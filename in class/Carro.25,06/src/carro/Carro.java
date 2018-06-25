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
public class Carro {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CapaTecho techo = new CapaTecho();
        CapaChasis chasis = new CapaChasis();
        
        techo.Techo();
        chasis.Chasis();
    }
    
}
