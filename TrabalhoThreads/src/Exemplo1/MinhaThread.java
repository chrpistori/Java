package Exemplo1;

class MinhaThread extends Thread{
    public void run() {
        System.out.println("Inicio: "+getName());
        for (int i=0; i<5; i++) {
            System.out.println(i+"-"+getName());
        }
        System.out.println("Fim: "+getName());
    }
}
