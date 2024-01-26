package Ej11;

public class ControlHilos {
    private boolean ticTurn = true;

    synchronized void printTic() {
        while (!ticTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("TIC ");
        ticTurn = false;
    }

    synchronized void printTac() {
        while (ticTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("TAC ");
        ticTurn = true;
    }
}
