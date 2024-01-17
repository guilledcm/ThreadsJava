package Ej2;

/*(0.5 pts) Modifica el ejercicio anterior y haz que los hilos visualizen los datos
    que tienen por defecto (nombre, prioridad e ID).
    a. la clase del hilo, en el método run() debe mostrar sus datos por separado
    y además utilizando el método toString(). Luego realizará un bucle del
    tipo “visualizando Hilo x” 20 veces.
    b. ¿Es el resultado el mismo en todas las ejecuciones?
    c. Cambia los nombres y la prioridad (Investiga los niveles de prioridad
    posibles)
    //hay tres tipos de prioridad min,norm,max
    d. ¿Se puede apreciar diferencia en el orden de los mensajes visualizados?
    //si
    */
public class Ej2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            Thread hiloEjer2 = new Thread(new HiloEjer2(i));
            if (i == 0) {
                hiloEjer2.setName("HiloPrioridadMinima");
                hiloEjer2.setPriority(Thread.MIN_PRIORITY);
            } else if (i == 1) {
                hiloEjer2.setName("HiloPrioridadNormal");
                hiloEjer2.setPriority(Thread.NORM_PRIORITY);
            } else {
                hiloEjer2.setName("HiloPrioridadMaxima");
                hiloEjer2.setPriority(Thread.MAX_PRIORITY);
            }

            hiloEjer2.start();
        }
    }

}
