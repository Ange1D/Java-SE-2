package ejemplo3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LimiteTest {

    @Test
    @DisplayName("Funciona con Enteros")
    void integer(){

        Limite<Integer> converter = new Limite<>();

        assertTrue(converter.esMayorQue(3, 2));
    }

    @Test
    @DisplayName("Funciona con Double")
    void doubles(){

        Limite<Double> converter = new Limite<>();

        assertTrue(converter.esMayorQue(3.2, 2.0));

    }

    @Test
    @DisplayName("Reto")
    void reto(){

        List<? extends Number> numberList;

        List<Integer> integerList = List.of(1,2,3);

        numberList = integerList;

        assertNotNull(numberList);
    }

}