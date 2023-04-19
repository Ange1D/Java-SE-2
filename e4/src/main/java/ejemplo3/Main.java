package ejemplo3;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        //Event loop
        EventLoopSimple eventLoop = new EventLoopSimple(evento -> {
            if(evento instanceof String){
                System.out.println("String recibido: " + evento);
            }
            else if(evento instanceof Number){
                System.out.println("Número recibido: " + evento);
            }
        });

        eventLoop.iniciar();
        eventLoop.registrarEvento("Hola mundo");

        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        eventLoop.registrarEvento(1);
        eventLoop.registrarEvento("Adiós");
        eventLoop.registrarEvento(10.0);

        eventLoop.detener();
    }
}
