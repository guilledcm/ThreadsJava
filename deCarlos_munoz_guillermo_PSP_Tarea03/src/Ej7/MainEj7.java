package Ej7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainEj7 {
        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    iniciarCronometros();
                }
            });
        }

        private static void iniciarCronometros() {
            JFrame frame1 = new JFrame("Cronómetro 1");
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel tiempoLabel1 = new JLabel("Tiempo 1:");
            frame1.getContentPane().add(tiempoLabel1);

            HiloEjer7 hilo = new HiloEjer7(60, tiempoLabel1);

            JButton pauseButton1 = new JButton("Pausar");
            JButton resumeButton1 = new JButton("Reanudar");

            pauseButton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    hilo.pausarCronometro();
                }
            });

            resumeButton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    hilo.reanudarCronometro();
                }
            });

            frame1.getContentPane().add(pauseButton1, BorderLayout.WEST);
            frame1.getContentPane().add(resumeButton1, BorderLayout.EAST);

            frame1.setSize(500, 350);
            frame1.setLocation(100, 100);
            frame1.setVisible(true);
        }

}
