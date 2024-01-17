package Ej4;
/*
    Realiza un cronómetro con una interfaz gráfica. Programa el método
    run() para hacer un cronómetro que al llegar a 0 se para y se pone en rojo. Desde
    una clase principal hay que crear diferentes cronómetros con diferentes tiempos
    y ejecutarlos de forma simultánea:
*/

import javax.swing.*;

public class Ej4 {
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

        HiloEjer4 hiloCronometro1 = new HiloEjer4();
        hiloCronometro1.iniciarCronometro(60, tiempoLabel1);

        frame1.setSize(500, 350);
        frame1.setLocation(100, 100);
        frame1.setVisible(true);

        JFrame frame2 = new JFrame("Cronómetro 2");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel tiempoLabel2 = new JLabel("Tiempo 2:");
        frame2.getContentPane().add(tiempoLabel2);

        HiloEjer4 hiloCronometro2 = new HiloEjer4();
        hiloCronometro2.iniciarCronometro(120, tiempoLabel2);

        frame2.setSize(500, 350);
        frame2.setLocation(300, 100);
        frame2.setVisible(true);
    }
}
