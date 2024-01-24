package Ej6;

public class MainEj6 {
    public static void main(String[] args) {
        HiloEjer6 hilo = new HiloEjer6();
        hilo.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo.interrupt();
    }
}
