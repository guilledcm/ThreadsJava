package Ej8;

import javax.swing.*;
import java.util.Random;

public class HiloEjer8 extends Thread{
    private JProgressBar progressBar;
    private JLabel label;
    private boolean ganador;
    private String nombreHilo;

    public HiloEjer8(JProgressBar progressBar, JLabel label,String nombreHilo) {
        this.progressBar = progressBar;
        this.label = label;
        this.ganador = false;
        this.nombreHilo = nombreHilo;
    }

    @Override
    public void run() {
        Random random = new Random();

        while (progressBar.getValue() < progressBar.getMaximum()) {
            int increment = random.nextInt(10);
            progressBar.setValue(progressBar.getValue() + increment);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        ganador = true;
        label.setText("Ganador: " + nombreHilo);
    }

    public boolean isWinner() {
        return ganador;
    }
}

