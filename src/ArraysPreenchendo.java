import java.util.Arrays;

public class ArraysPreenchendo {

    public static void ArraysPreenchendo(){
        String[] names = new String[10];
        System.out.println(Arrays.toString(names));
        Arrays.fill(names, "desconhecido");
        System.out.println(Arrays.toString(names));
    }

}
