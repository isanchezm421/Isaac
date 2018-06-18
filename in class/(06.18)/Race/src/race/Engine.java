/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race;

/**
 *
 * @author davibq
 */
public class Engine {
    private String brand;
    private int horsepower;
    
    public Engine(String brand, int horsepower) {
        this.brand = brand;
        this.horsepower = horsepower;
    }
    
    public int getHorsepower() {
        return horsepower;
    }
}
