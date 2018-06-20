/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimetrosyareas;

import java.util.Scanner;

/**
 *
 * @author Yopuesquienmás
 */
public class Submenus {
    
    void SubmenuPerimetro(){
        perimetro formageo = new perimetro();
        Scanner sc = new Scanner(System.in);
        Submenus submenuperi = new Submenus();
        System.out.println("¿Con que forma desea realizar sus perimetros? (1:CUADRADO, 2:RECTANGULO, o 3:CIRCULO)");
        int forma = sc.nextInt();
        if (forma ==1) {
            formageo.PerimetroCuadrado();
        }else if (forma ==2) {
            formageo.PerimetroRectangulo();
        }else if (forma == 3) {
            formageo.PerimetroCirculo();
        }else{
           System.out.println("Forma Invalida");
           SubmenuPerimetro();
        }                    
            }

    void SubmenuArea() {
        area formageo = new area();
        Scanner sc = new Scanner(System.in);
                Submenus submenuarea = new Submenus();
                System.out.println("¿A que forma desea sacarle area? (1:CUADRADO, 2:RECTANGULO, o 3:CIRCULO)");
                int forma = sc.nextInt();
                if (forma == 1) {
                    formageo.AreaCuadrado();
                   
                    
                }else if (forma == 2) {
                    formageo.AreaRectangulo();
                }else if (forma == 3) {
                    formageo.AreaCirculo();
                }else {
                    System.out.println("Forma Invalida");
                    SubmenuArea();
                }
    }

    
}   
