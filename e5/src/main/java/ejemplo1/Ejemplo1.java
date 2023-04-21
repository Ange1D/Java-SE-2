package ejemplo1;


import generator.RxJavaObservableGenerator;
import io.reactivex.Single;

class Ejemplo1 {
    static Single<Integer> sumarSingle(){
        return RxJavaObservableGenerator
                .observableStream()
                .reduce(0,(a,b) -> a + b);
    }

    static Integer sumar(){
        return RxJavaObservableGenerator
                .observableStream()
                .reduce(0,(a,b) -> a + b)
                .blockingGet();
    }

    static Single<Integer> reto(){
        return RxJavaObservableGenerator
                .observableStream()
                .map( v -> v*v*v)
                .filter(v -> v > 50)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args){

        Single<Integer> si = Ejemplo1.sumarSingle();
        Integer i = Ejemplo1.sumar();
        System.out.println("Single: "+si.blockingGet());
        System.out.println("Single: "+i);

        Single<Integer> r = Ejemplo1.reto();
        System.out.println("reto: "+r.blockingGet());

    }

}
