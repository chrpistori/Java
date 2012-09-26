package Exemplo5;

public class Deposito {

    private boolean ok = false;
    private int valor;

    public synchronized void armazenar(int valor) {
        while (ok == true) {
            try {
                wait();
            } catch (InterruptedException ie) {
            }
        }
        this.valor = valor;
        ok = true;
        notifyAll();
    }

    public synchronized int retirar() {
        synchronized (this) {
            while (ok == false) {
                try {
                    wait();
                } catch (InterruptedException ie) {
                }
            }
            ok = false;
            notifyAll();
            return valor;
        }
    }
}