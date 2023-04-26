package ejemplo1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    @DisplayName("Convierte enteros")
    void string() {
        Integer integer = 2504;
        String expected = "2504";

        Converter<Integer> integerConverter = new Converter<>();

        assertEquals(expected, integerConverter.convertir(integer));
    }

    @Test
    @DisplayName("Convierte un Boolean")
    void booleano() {
        Boolean aBoolean = Boolean.TRUE;
        String expected = "true";

        Converter<Boolean> integerConverter = new Converter<>();

        assertEquals(expected, integerConverter.convertir(aBoolean));
    }
}