package Ej4;

import javax.swing.*;
import java.awt.*;

public class HiloEjer4 implements Runnable {
    private int tiempoRestante;
    private JLabel labelTiempo;

    public void iniciarCronometro(int tiempoInicial, JLabel label) {
        tiempoRestante = tiempoInicial;
        labelTiempo = label;

        Thread hiloCronometro = new Thread(this);
        hiloCronometro.start();
    }

    @Override
    public void run() {
        while (tiempoRestante > 0) {
            actualizarTiempo();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
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

    public static void main(String[] args) {
        // Ejemplo de uso en una clase principal
        JFrame frame = new JFrame("Ejemplo de Hilo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel tiempoLabel = new JLabel("Tiempo:");
        frame.getContentPane().add(tiempoLabel);

        HiloEjer4 hiloEjemplo = new HiloEjer4();
        hiloEjemplo.iniciarCronometro(10, tiempoLabel);

        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}