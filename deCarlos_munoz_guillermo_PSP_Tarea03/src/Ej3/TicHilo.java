package Ej3;

public class TicHilo extends Thread{
    public void run() {
        while (true) {
            System.out.print("TIC ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
