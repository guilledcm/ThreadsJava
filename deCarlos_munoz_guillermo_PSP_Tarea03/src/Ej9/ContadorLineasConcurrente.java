package Ej9;

public class ContadorLineasConcurrente {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        
        String[] nombresArchivos = {"fichero1.txt", "fichero2.txt", "fichero3.txt"};
        
        BuscadorLineas[] buscadores = new BuscadorLineas[nombresArchivos.length];
        for (int i = 0; i < nombresArchivos.length; i++) {
            buscadores[i] = new BuscadorLineas(nombresArchivos[i]);
            buscadores[i].start();
        }

        for (BuscadorLineas buscador : buscadores) {
            try {
                buscador.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo concurrente: " + (fin - inicio) + " ms");
        
        int totalLineas = 0;
        for (BuscadorLineas buscador : buscadores) {
            totalLineas += buscador.getContador();
        }

        System.out.println("Número total de líneas: " + totalLineas);
    }
}
