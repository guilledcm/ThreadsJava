package Ej10;

public class MainEj10 {
    public static void main(String[] args) {
        String directorioPath = "E://DAMGS2GuillermoDeCarlosMunoz";
        
        HiloDirectorio hiloDirectorio = new HiloDirectorio(directorioPath);
        hiloDirectorio.start();
    }
}
