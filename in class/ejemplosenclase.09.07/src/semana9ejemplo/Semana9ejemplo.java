
package semana9ejemplo;


public class Semana9ejemplo {
    
    public static void main(String[] args){
 //   int[][] matriz = new int [5][5];
   // int contador = 1;
    
  //  for (int i = 0; i < matriz.length; i++) {
   //     for(int j = 0; j < matriz[i].length; j++) {
       //     matriz[i][j] = contador ++;
      //  }
 //   }
    int[][] matriz= {
        { 1, 2, 3, 4, 5},
        { 1, 2, 3, 4, 5},
        { 1, 2, 3, 4, 5},
        { 1, 2, 3, 4, 5}
            };
    int contador = 1;
    
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++){
            matriz[i][j] = contador++;
       
   System.out.println(matriz);
     
    }

 
 
    }
    
}
