package ejemplo2;

public class MethodConverter {

    public static <E> String convertToString(E input){
        return input.toString();
    }
}
