package Exercicio4;

import java.util.Random;

public class B_Matriz extends Thread{

    public void run() {
        int mat1[][] = new int[2][2];
        int mat2[][] = new int[2][2];
        int i, j;
        Random random = new Random();
        for (i = 0; i < mat1.length; i++) // cria uma matriz randomica mat1  
        {
            for (j = 0; j < mat1.length; j++) {
                int num = random.nextInt(10);
                mat1[i][j] = num;
            }
        }
        for (i = 0; i < mat2.length; i++) // cria uma matriz randomica mat2  
        {
            for (j = 0; j < mat2.length; j++) {
                int num = random.nextInt(10);
                mat2[i][j] = num;
            }
        }
        B_CalculaMatrizes calc = new B_CalculaMatrizes(mat1, mat2);
        System.out.println(calc);
    }
}
