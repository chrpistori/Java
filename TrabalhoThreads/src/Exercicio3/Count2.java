
package Exercicio3;

public class Count2 extends Thread{
    public void run() {
        System.out.println("Inicio2");
        for (int i=0; i<21; i++) {
            System.out.println(i);
        }
        System.out.println("Fim");
    }
}