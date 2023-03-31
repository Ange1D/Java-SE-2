import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MiRunnablePool implements Runnable {
    private String nombre;

    public MiRunnablePool(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try{
            while(true){
                System.out.println(nombre + " en ejecución...");
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); //agregar hasta después de la explicación
            System.out.println(nombre + " fue interrumpido");
            System.out.println(nombre + " Thread.currentThread().isInterrupted()=" + Thread.currentThread().isInterrupted());
        }
    }


    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();

        String[] nombres = {"UNO", "DOS", "TRES","CUATRO"};
        for (String nombre : nombres) {
            pool.execute(new MiRunnablePool(nombre));
        }

        pool.shutdown();

        try {
            long tiempoLimiteMs = 100;
            boolean terminaron = pool.awaitTermination(tiempoLimiteMs, TimeUnit.MILLISECONDS);

            if(!terminaron){
                List<Runnable> pendientes = pool.shutdownNow();
                terminaron = pool.awaitTermination(tiempoLimiteMs, TimeUnit.MILLISECONDS);

                if(!terminaron){
                    System.out.println("nO HAN TERMINADO");
                }
                System.out.println("Terminado");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
