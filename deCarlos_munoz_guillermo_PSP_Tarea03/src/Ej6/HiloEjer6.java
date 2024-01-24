package Ej6;

public class HiloEjer6 extends Thread{
    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println("Mensaje del hilo");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("interrumpido");
        }
    }
}
