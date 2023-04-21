package ejemplo2;


import generator.ReactorFluxGenerator;
import reactor.core.publisher.Mono;

public class Ejemplo2 {
    static Mono<Integer> sumarMono(){
        return ReactorFluxGenerator
                .fluxStream()
                .reduce(0,(a,b) -> a + b);
    }

    static Integer sumar(){
        return ReactorFluxGenerator
                .fluxStream()
                .reduce(0,(a,b) -> a + b)
                .block();
    }

    static Mono<Integer> reto(){
        return ReactorFluxGenerator
                .fluxStream()
                .flatMap(v -> Mono.just(v*v*v))
                .filter(v -> v < 50)
                .reduce(0, Integer::sum);
    }

    public static void main(String[]args){
        Mono<Integer> mi = Ejemplo2.sumarMono();
        Integer i = Ejemplo2.sumar();
        System.out.println("MONO: "+mi.block());
        System.out.println("INT: "+i);

        Mono<Integer> r = Ejemplo2.reto();
        System.out.println("RETO: "+mi.block());

    }
}
