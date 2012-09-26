/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

public class Count extends Thread{
    private int max;
    
    public Count(){
        this.max = 500;
    }
    
    public void run() {
        System.out.println("Inicio\n");
        for (int i = 0; i < max; i++) {
            System.out.println(i);
        }
        System.out.println(max+"\nFim");
    }
}
