package Ej8;

import javax.swing.*;
import java.awt.*;

public class MainEj8 extends JFrame {
    private JProgressBar progressBar1, progressBar2, progressBar3;
    private JLabel labelGanador;

    public MainEj8() {
        super("Carrera de Hilos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        progressBar1 = new JProgressBar();
        progressBar2 = new JProgressBar();
        progressBar3 = new JProgressBar();

        labelGanador = new JLabel("¡En la carrera!");

        add(progressBar1);
        add(progressBar2);
        add(progressBar3);
        add(labelGanador);

        setLayout(new GridLayout(4, 1));

        HiloEjer8 hilo1 = new HiloEjer8(progressBar1, labelGanador,"Hilo1");
        HiloEjer8 hilo2 = new HiloEjer8(progressBar2, labelGanador,"Hilo2");
        HiloEjer8 hilo3 = new HiloEjer8(progressBar3, labelGanador,"Hilo3");

        hilo1.start();
        hilo2.start();
        hilo3.start();

        Thread monitorThread = new Thread(() -> {
            while (true) {
                if (hilo1.isWinner()) {
                    hilo2.interrupt();
                    hilo3.interrupt();
                    break;
                } else if (hilo2.isWinner()) {
                    hilo1.interrupt();
                    hilo3.interrupt();
                    break;
                } else if (hilo3.isWinner()) {
                    hilo1.interrupt();
                    hilo2.interrupt();
                    break;
                }
            }
        });

        monitorThread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainEj8 carreraHilos = new MainEj8();
            carreraHilos.setVisible(true);
        });
    }
}
