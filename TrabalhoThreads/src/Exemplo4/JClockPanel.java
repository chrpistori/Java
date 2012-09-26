package Exemplo4;

import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class JClockPanel extends JPanel implements Runnable {

    private Thread interna = null;
    private boolean stop = false;
    private SimpleDateFormat sdf;
    private JLabel lTime;
    public String format = "E dd/MM/yyyy HH:mm:ss";

    public JClockPanel() {
        add(lTime = new JLabel(format));
        sdf = new SimpleDateFormat(format);
    }

    public void start() {
        if (interna == null) {
            interna = new Thread(this, "Relogio");
            interna.start();
        }
    }

    public void stop() {
        stop = true;
        interna = null;
    }

    public void run() {
        while (!stop) {
            repaint();
            try {
                interna.sleep(1000);
                lTime.setText(sdf.format(new Date()));
            } catch (InterruptedException ie) {
            }
        }
    }
}
