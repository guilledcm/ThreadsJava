package Ej11;

public class MainEj11 {
    public static void main(String[] args) {
        ControlHilos control = new ControlHilos();
        TicHilo ticHilo = new TicHilo(control);
        TacHilo tacHilo = new TacHilo(control);

        ticHilo.start();
        tacHilo.start();
    }
}
