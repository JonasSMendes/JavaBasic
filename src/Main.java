
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        OnePiece[] tripulacao = new OnePiece[]{
                new OnePiece("luffy", "nika nika no mi"),
                new OnePiece("zoro", "nenhuma"),
                new OnePiece("robin", "hana hana no mi"),
                new OnePiece("nami", "nenhuma"),
        };

        String name = tripulacao[2].getname();
        String nomi = tripulacao[2].getAkumaNoMi();

        System.out.println(name + " " +nomi);



    }
}