/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana11;

/**
 *
 * @author ulacit
 */
public class Semana11 {

    /**
     * exceptions
     */
    private static double divide(int n1, int n2) {
        if (n2 == 0){
            throw new NumberFormatException("0 is not expected");
          
        }
        return n1/n2;
    
    
        
    }
    
    public static void main (String[] args){
        try {
            double res = divide(25, 0);
            System.out.println("Resultado: " + res);
        } catch (NumberFormatException ex)     {
            System.out.println("Ocurrio un error de formato de numero!");
            System.out.println(ex.getMessage());
        } catch (ArithmeticException ex)   {
            System.out.println("Exception aritmetica!");
            System.out.println(ex.getMessage());
         } finally{
            System.out.println("Esto siempre se ejecuta!");
        }
        
    }
    
}

