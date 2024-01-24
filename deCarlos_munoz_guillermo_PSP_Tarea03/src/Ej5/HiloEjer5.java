package Ej5;
/*
    Crea una clase hilo que tenga tres métodos:
    a. run(): incrementará un contador en bucle sin retrasos y hasta que se
    indique mediante su correspondiente variable que debe terminar
    b. stopHilo(): activará la variable de finalización
    c. getContador(): retorna el valor del contador
*/
public class HiloEjer5 extends Thread {
    private volatile boolean detener;
    private int contador;

    public HiloEjer5() {
        this.detener = false;
        this.contador = 0;
    }

    public void run() {
        while (!detener) {

            contador++;
        }
    }

    public void stopHilo() {
        detener = true;
    }

    public int getContador() {
        return contador;
    }
}

