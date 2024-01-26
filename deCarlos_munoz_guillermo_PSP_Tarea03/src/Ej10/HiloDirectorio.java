package Ej10;

import java.io.File;

public class HiloDirectorio extends Thread{
    private String rutaDirectorio;

    public HiloDirectorio(String rutaDirectorio) {
        this.rutaDirectorio = rutaDirectorio;
    }

    @Override
    public void run() {
        while (true) {
            try {
                listarContenidoDirectorio();

                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void listarContenidoDirectorio() {
        File directorio = new File(rutaDirectorio);

        if (!directorio.exists() || !directorio.isDirectory()) {
            System.out.println("directorio no existe");
            return;
        }

        File[] archivos = directorio.listFiles();
        
        System.out.println("Contenido del directorio:");
        for (File archivo : archivos) {
            System.out.println(archivo.getName());
        }

        System.out.println("------------------------------");
    }
}
