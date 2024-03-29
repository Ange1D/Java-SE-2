import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

class Ejemplo2Test {
    private final List<Integer> CONJUNTO = Arrays.asList(1, 4, 6, 2, -5, 9);

    @Test
    @DisplayName("Negativos")
    void negatives() {
        Ejemplo2 ejemplo2 = new Ejemplo2();

        List<Integer> real = ejemplo2.transformar(CONJUNTO, s -> -s);

        assertThat(real).containsExactly(-1, -4, -6, -2, 5, -9);

    }

    @Test
    @DisplayName("Cuadrados")
    void squares() {
        Ejemplo2 ejemplo2 = new Ejemplo2();

        List<Integer> real = ejemplo2.transformar(CONJUNTO, s -> s * s);

        assertThat(real).containsExactly(1, 16, 36, 4, 25, 81);

    }

    @Test
    @DisplayName("suma uno")
    void suma1() {
        Ejemplo2 ejemplo2 = new Ejemplo2();

        List<Integer> real = ejemplo2.transformar(CONJUNTO, n -> n + 1);

        assertThat(real).containsExactly(2, 5, 7, 3, -4, 10);

    }

    @Test
    void multiplica5 (){
        Ejemplo2 ej = new Ejemplo2();

        Function<Integer, Integer> foo = n -> n*5;

        List<Integer> res = ej.transformar(CONJUNTO,foo);

        assertThat(res).containsExactly(5, 20, 30, 10, -25, 45);
    }

    @Test
    @DisplayName("Transforma y suma")
    void reto(){
        Ejemplo2 ejemplo2 = new Ejemplo2();

        Integer real = ejemplo2.transformarYSumar(CONJUNTO, s -> 1);

        assertThat(real).isEqualTo(CONJUNTO.size());
    }
}