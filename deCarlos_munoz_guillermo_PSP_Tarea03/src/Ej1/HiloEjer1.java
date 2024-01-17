package Ej1;

public class HiloEjer1 implements Runnable{
    private int numeroHilo;
    public HiloEjer1(int numeroHilo) {
        this.numeroHilo = numeroHilo;
        System.out.println("Creando hilo " + numeroHilo);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hilo " + numeroHilo + ": Contador = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
