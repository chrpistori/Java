package Exercicio4;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class C_Matriz extends Thread {

    public void run() {
        int mat1[][] = new int[2][2];
        int mat2[][] = new int[2][2];
        int i, j;
        for (i = 0; i < mat1.length; i++) // cria uma matriz randomica mat1  
        {
            for (j = 0; j < mat1.length; j++) {
                int num = Integer.parseInt(JOptionPane.showInputDialog("1ª Matriz:\nInforme o valor da " + (i + 1) + "ª linha e " + (j + 1) + "ª coluna:"));
                mat1[i][j] = num;
            }
        }
        for (i = 0; i < mat2.length; i++) // cria uma matriz randomica mat2  
        {
            for (j = 0; j < mat2.length; j++) {
                int num = Integer.parseInt(JOptionPane.showInputDialog("2ª Matriz:\nInforme o valor da " + (i + 1) + "ª linha e " + (j + 1) + "ª coluna:"));
                mat2[i][j] = num;
            }
        }
        C_CalculaMatrizes calc = new C_CalculaMatrizes(mat1, mat2);
    }
}
