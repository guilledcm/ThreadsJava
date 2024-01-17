package Ej3;
/*(1 pts) Crea dos clases (hilos) Java que extiendan la clase Thread.
    a. Uno de los hilos debe visualizar en pantalla en un bucle infinito la
    palabra TIC y el otro hilo la palabra TAC.
    b. Dentro del bucle utiliza el método sleep() para que nos dé tiempo a ver
    las palabras que se visualizan cuando lo ejecutemos, tendrás que añadir
    un bloque try-catch (para capturar la excepción lnterruptedException).
    c. Crea después la función main() que haga uso de los hilos anteriores. ¿Se
    visualizan los textos TIC y TAC de forma ordenada (es decir TICTAC
    TICTAC ... )?
    //No se ven de forma desordenada, para poder verlos de forma ordenada podriamos usar el metodo synchronized y asi un
    //hilo espera al otro para poder iniciarse.
*/
public class Ej3 {
    public static void main(String[] args) {
        TicHilo ticHilo = new TicHilo();
        TacHilo TacHilo = new TacHilo();

        ticHilo.start();
        TacHilo.start();
    }
}
