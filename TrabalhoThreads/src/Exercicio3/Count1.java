
package Exercicio3;

public class Count1 extends Thread{
    public void run() {
        System.out.println("Inicio1");
        for (int i=0; i<11; i++) {
            System.out.println(i);
        }
        System.out.println("Fim");
    }
}
