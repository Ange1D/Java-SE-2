package ejemplo2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EchoClassTest {

    @Test
    @DisplayName("Eco de un string (generics expícito)")
    void echoString() {
        String input = "Hola Mundo";

        assertEquals(input, EchoClass.echo(input));
    }

    @Test
    @DisplayName("Eco de un Integer (generics implícito, tipo inferido)")
    void echoInteger() {
        Integer input = 2504;

        assertEquals(input, EchoClass.echo(input));
    }

    private class Clase {
        private String nombre;

        Clase(String nombre){
            this.nombre = nombre;
        }

    }

    @Test
    void echoClase(){
        Clase input = new Clase("Angel");

        assertEquals(input, EchoClass.echo(input));
    }
}