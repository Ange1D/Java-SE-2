package ejemplo1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HolderTest {

    @Test
    @DisplayName("Puede guardar un Integer")
    void entero(){
        Integer entero = 2504;
        Holder<Integer> holder = new Holder<>();
        holder.hold(entero);

        assertEquals(entero, holder.release());

    }

    @Test
    @DisplayName("Puede guardar un String")
    void cadena(){
        String str = "Hola";
        Holder<String> holder = new Holder<>();
        holder.hold(str);

        assertEquals(str, holder.release());

    }


    private class Clase {
        private String nombre;

        Clase(String nombre){
            this.nombre = nombre;
        }

        public String getNombre(){
            return nombre;
        }

    }

    @Test
    @DisplayName("Puede guardar una clase propia")
    void custom(){

        Clase clase = new Clase("Angel");

        Holder<Clase> holder = new Holder<>();
        holder.hold(clase);

        assertEquals(clase, holder.release());
        assertEquals(clase.getNombre(), "Angel");

    }

}