import java.util.Arrays;

public class Objetos {

    public static void Objetos(){
        int[] number = new int[]{10,30 , 40, 60 , 70 ,90};

        Arrays.sort(number);
        System.out.println(number); // <-- hashcode int[] (identificador)

        System.out.println(Arrays.toString(number));
    }
}
