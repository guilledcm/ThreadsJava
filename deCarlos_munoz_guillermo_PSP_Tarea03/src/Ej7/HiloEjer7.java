package Ej7;

import javax.swing.*;
import java.awt.*;

public class HiloEjer7 implements Runnable{
    private int tiempoRestante;
    private JLabel labelTiempo;
    private volatile boolean isPaused;

    public HiloEjer7(int tiempoInicial, JLabel label) {
        tiempoRestante = tiempoInicial;
        labelTiempo = label;
        isPaused = false;

        Thread hiloCronometro = new Thread(this);
        hiloCronometro.start();
    }

    public void pausarCronometro() {
        isPaused = true;
    }

    public void reanudarCronometro() {
        isPaused = false;
    }

    @Override
    public void run() {
        while (tiempoRestante > 0) {
            if (!isPaused) {
                actualizarTiempo();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        labelTiempo.setForeground(Color.RED);
    }

    private void actualizarTiempo() {
        tiempoRestante--;
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                labelTiempo.setText(formatoTiempo(tiempoRestante));
            }
        });
    }

    private String formatoTiempo(int segundos) {
        int minutos = segundos / 60;
        int segundosRestantes = segundos % 60;
        return String.format("%02d:%02d", minutos, segundosRestantes);
    }
}
