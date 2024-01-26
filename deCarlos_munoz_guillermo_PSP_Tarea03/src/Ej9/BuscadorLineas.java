package Ej9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuscadorLineas extends Thread{
    private String nombreArchivo;
    private int contador;

    public BuscadorLineas(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.contador = 0;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            while (br.readLine() != null) {
                contador++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getContador() {
        return contador;
    }
}
