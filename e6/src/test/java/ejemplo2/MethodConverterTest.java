package ejemplo2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodConverterTest {

    @Test
    @DisplayName("Prueba con Integers")
    void prueba(){
        Integer input = 2023;
        String expected = "2023";

        assertEquals(expected, MethodConverter.convertToString(input));
    }

}