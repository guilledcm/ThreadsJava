package Ej3;

public class TacHilo extends Thread{
    public void run() {
        while (true) {
            System.out.print("TAC ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
