package Exemplo2;

import java.util.Calendar;

public class ImprimeMensagemThread {
    private String mensagem;
    private static final int REPETICOES = 10;
    private static final int ESPERAEMMILISEG = 1000;
    public ImprimeMensagemThread (String aGreeting){
        mensagem = aGreeting;
    }
    public void run () {
        try {
            for (int i = 1; i < REPETICOES; i++) {
                notify();
                Calendar row = Calendar.getInstance();
                System.out.println(row.get(Calendar.HOUR_OF_DAY) + ":" + row.get(Calendar.MINUTE) + ":" + row.get(Calendar.SECOND) + " "+ mensagem);
                wait(ESPERAEMMILISEG);
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
    /*public static void main (String[] args) {
        ImprimeMensagemThread t1 = new ImprimeMensagemThread("OLA, MUNDO!");
        System.out.println("Inicio Thread Principal");
        ImprimeMensagemThread t2 = new ImprimeMensagemThread("ATE LOGO, MUNDO!");
        
    }*/
}
