package Exercicio4;

import javax.swing.JOptionPane;

public class C_CalculaMatrizes {

    public static void calculaMatrizes(int a[][], int b[][]) {
        {
            int row, column, aux, i;
            int c[][] = new int[2][2];
            String matrizFormatada;
            for (row = 0; row < c.length; row++) // multiplicação das matrizes  
            {
                for (column = 0; column < c[row].length; column++) {
                    aux = 0;
                    for (i = 0; i < a[row].length; i++) {
                        aux = aux + a[row][i] * b[i][column];
                    }
                    c[row][column] = aux;

                }
            }

            
            matrizFormatada = C_FormataMatriz.formataMatriz(c);
            JOptionPane.showMessageDialog(null, matrizFormatada);
        }
    }
}