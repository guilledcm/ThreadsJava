package Ej11;

public class TacHilo extends Thread{
    private final ControlHilos control;

    public TacHilo(ControlHilos control) {
        this.control = control;
    }

    public void run() {
        while (true) {
            control.printTac();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
