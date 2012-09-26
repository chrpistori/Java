
package Exercicio4;
public class C_FormataMatriz {

        public static String formataMatriz(int C[][]) {
            String aux2 = "";
            int row, column;
            for (row = 0; row < C.length; row++) {
                for (column = 0; column < C[row].length; column++) {
                    aux2 = aux2 + C[row][column] + " ";
                }
                aux2 = aux2 + "\n"; // Guarda uma quebra de linha na String  
            }
            return aux2; //retorna a String  
        }
    }