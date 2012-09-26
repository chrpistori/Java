package Exercicio4;

import javax.swing.JOptionPane;

public class C_CalculaMatrizes {

    public C_CalculaMatrizes(int a[][], int b[][]) {
        {
            int row, column, aux, i;
            int c[][] = new int[2][2];
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

            System.out.println("Matriz A");
            for (row = 0; row < a.length; row++) {
                for (column = 0; column < a[row].length; column++) {
                    System.out.printf("%d ", a[row][column]);

                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Matriz B");
            for (row = 0; row < b.length; row++) {
                for (column = 0; column < b[row].length; column++) {
                    System.out.printf("%d ", b[row][column]);

                }
                System.out.println();
            }
            System.out.println();
            String matrizFormatada;
            matrizFormatada = new formataMatriz(int c[row][column]);
            JOptionPane.showMessageDialog(null, matrizFormatada);
        }
    }
}