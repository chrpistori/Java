
package Exemplo3;

public class HelloRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Hello from a thread!");
    }
  /*  public static void main(String args[]){
        HelloRunnable hello = new HelloRunnable();
        Thread threadHello = new Thread(hello);
        threadHello.start();
    }*/
}
