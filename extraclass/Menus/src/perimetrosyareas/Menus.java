/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimetrosyareas;
import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class Menus {
    
    
    public static void main(String[] args) {
        boolean salir = false;
        
        while (salir != true){
            Submenus operacion = new Submenus();
            Submenus submenu = new Submenus();
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite la decision que desee realizar (1 para obtener PERIMETRO, 2 para AREA, 3 para SALIR)");
            int decision = sc.nextInt();
            
        
        
        if (decision == 1) {
            operacion.SubmenuPerimetro();
          
        } else if (decision == 2) {
            operacion.SubmenuArea();
        } else if (decision == 3){
          System.out.println("¡Adios!");
          break;
        }
        
          
        } 
    }
        
}
