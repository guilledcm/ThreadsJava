package Ej11;

public class TicHilo extends Thread{
    private final ControlHilos control;

    public TicHilo(ControlHilos control) {
        this.control = control;
    }

    public void run() {
        while (true) {
            control.printTic();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
