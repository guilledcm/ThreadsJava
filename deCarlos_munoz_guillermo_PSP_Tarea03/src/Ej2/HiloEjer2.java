package Ej2;

public class HiloEjer2 implements Runnable{
    private int numeroHilo;
    public HiloEjer2(int numeroHilo) {
        this.numeroHilo = numeroHilo;
        System.out.println("Creando hilo " + numeroHilo);
    }

    @Override
    public void run() {
        System.out.println("Hilo " + numeroHilo + " en ejecución: " + this);

        for (int i = 1; i <= 20; i++) {
            System.out.println("Visualizando Hilo " + numeroHilo + " - Iteración " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "Hilo " + numeroHilo + " - Nombre: " + Thread.currentThread().getName() +
                ", Prioridad: " + Thread.currentThread().getPriority() +
                ", ID: " + Thread.currentThread().getId();
    }
}
