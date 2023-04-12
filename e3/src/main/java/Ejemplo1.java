import java.util.function.Function;

public class Ejemplo1 {

    private final StringToInteger parser = s -> Integer.parseInt(s);

    Integer sumar(String a, String b) {

        return parser.convertir(a) + parser.convertir(b);
    }

    private final Function<String, Integer> parser2 = Integer::parseInt;

    Integer sumar2(String a, String b) {
        return parser2.apply(a) + parser2.apply(b);
    }

}
