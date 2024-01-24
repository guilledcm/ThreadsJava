package Ej5;

public class MainEj5 {
    public static void main(String[] args) {
        HiloEjer5 hiloPrioridadMin = new HiloEjer5();
        HiloEjer5 hiloPrioridadNormal = new HiloEjer5();
        HiloEjer5 hiloPrioridadMax = new HiloEjer5();

        hiloPrioridadMin.setPriority(Thread.MIN_PRIORITY);
        hiloPrioridadNormal.setPriority(Thread.NORM_PRIORITY);
        hiloPrioridadMax.setPriority(Thread.MAX_PRIORITY);

        hiloPrioridadMin.start();
        hiloPrioridadNormal.start();
        hiloPrioridadMax.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hiloPrioridadMin.stopHilo();
        hiloPrioridadNormal.stopHilo();
        hiloPrioridadMax.stopHilo();

        try {
            hiloPrioridadMin.join();
            hiloPrioridadNormal.join();
            hiloPrioridadMax.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int ContadorMin = hiloPrioridadMin.getContador();
        int ContadorNormal = hiloPrioridadNormal.getContador();
        int ContadorMax = hiloPrioridadMax.getContador();


        System.out.println("contador min " + ContadorMin);
        System.out.println("contador norm " + ContadorNormal);
        System.out.println("contador max " + ContadorMax);
    }
}
