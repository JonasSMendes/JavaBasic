
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User jonas = new User("jonas", "amorin");
        User tiago = new User("tiago", "amorin");

        tiago.setCount(1);
        tiago.setCount(1);
        tiago.setCount(1);

        jonas.setCount(2);
        jonas.setCount(2);
        jonas.setCount(2);

        System.out.println(tiago.getCount());
        System.out.println(jonas.getCount());


    }
}