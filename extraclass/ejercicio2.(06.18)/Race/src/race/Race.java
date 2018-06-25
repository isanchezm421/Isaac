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
public class Race {

    private static final double MAX_POSITION = 1000;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car mazda = new Car("Mazda", 105);
        Car toyota = new Car("Toyota", 100);
        Car nissan = new Car("Nissan", 95);
        mazda.setWheels(20);
        toyota.setWheels(17);
        nissan.setWheels(18);
        
        
        int counter = 0;
        
        boolean winner = false;
        
        while (!winner) {
            counter++;
            double mazdaPosition = mazda.move(),
                   toyotaPosition = toyota.move(),
                   nissanPosition = nissan.move();
            
            if (mazdaPosition >= MAX_POSITION || toyotaPosition >= MAX_POSITION || nissanPosition >= MAX_POSITION) {
                winner = true;
            }
        }
        
        System.out.println("Después de " + counter + " rondas, estos son los resultados: ");
        System.out.println(mazda.getBrand() + " recorrió " + mazda.getPosition() + "m." + (mazda.getPosition() >= MAX_POSITION ? " Fue el ganador" : ""));
        System.out.println(toyota.getBrand() + " recorrió " + toyota.getPosition() + "m." + (toyota.getPosition() >= MAX_POSITION ? " Fue el ganador" : ""));
        System.out.println(nissan.getBrand() + " recorrió " + nissan.getPosition() + "m." + (nissan.getPosition() >= MAX_POSITION ? " Fue el ganador" : ""));
        
    }
    
}
