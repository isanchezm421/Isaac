
package semana9ejemplo;


public class ejercicio1 {
     
    
    public static void main(String[] args) {
        int[][] arre = {
            {1, 2, 3, 4, 5},
            {2, 1, 3, 4, 5},
            {3, 2, 1, 4, 5},
            {2, 4, 5, 1, 3},
            {5, 4, 3, 2, 1}
        };
        int nDiagonal = 0;
        boolean hasAssignedNDiagonal = false;
        boolean diagonalOk = true;
        int contador = 1;
        for (int i = 0; i < arre.length; i++) {
            for (int j = 0; j < arre[i].length; j++) {
                if (i == j) {
                    if (hasAssignedNDiagonal) {
                        hasAssignedNDiagonal = true;
                        nDiagonal = arre[i][j];
                    } else if (nDiagonal != arre[i][j]) {
                        diagonalOk = false;
                    }
                }
                arre[i][j] = contador++;
                System.out.println("Diagonal: " + (diagonalOk ? "ok" : "mal"));

            }

        }

    }
