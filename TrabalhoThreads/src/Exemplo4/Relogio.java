package Exemplo4;

import javax.swing.*;

public class Relogio extends JFrame {

    public Relogio() {
        super("Relógio");
        JClockPanel clock = new JClockPanel();
        clock.start();
        getContentPane().add("Center", clock);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    /*public static void main(String args[]) {
        new Relogio().setVisible(true);
    }*/
}