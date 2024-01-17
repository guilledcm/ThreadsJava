package Ej1;

/*1. (0.5 pts) Realiza una clase que cree 3 hilos (con un bucle) y visualice un
mensaje donde se muestre el número de hilo que se está ejecutando y el
contenido de un contador.
    a. El contador debe llegar hasta 5.
    b. A la hora de crear el hilo debe aparecer un mensaje de “Creando hilo“ y
    su número.
    c. Cuando el hilo termine, notificarlo.
    d. Una vez creados los 3 hilos, notificar que se han realizado estos.
    e. ¿Qué sucede? ¿Es lo que esperabas? Haz una captura de pantalla.
    //si , ya que al no poner el synchronized no espera el uno al otro se ejecutan sin orden
    f. ¿Se puede modificar el comportamiento de los hilos para que realice las
    acciones en el orden esperado? ¿Cómo?
    si con el synchronized
*/
public class Ej1 {
    public static void main(String[] args) {
        for (int i=0;i<=2;i++){
            Thread hiloEjer1 = new Thread(new HiloEjer1(i));
            hiloEjer1.start();
        }
    }
}
