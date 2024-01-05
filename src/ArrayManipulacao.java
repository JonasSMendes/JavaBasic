import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayManipulacao {

    public static void ArrayManipulacao (){
        List<String> names = new ArrayList<>();

        //adicionar elemento
        names.add("nome 1");
        names.add("nome 4");
        names.add("nome 3");
        names.add("nome 2");


        //buscar o elemento
        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        //buscar um index pelo elemento

        int index = names.indexOf("nome 2");
        System.out.println(index);

        //esta vazia ou não
        System.out.println(names.isEmpty());

        //saber se contain o elemento
        System.out.println(names.contains("nome 3"));

        //verificar o tamanho da lista

        System.out.println(names.size());

        //limpar os valores do obejto

        names.clear();
        System.out.println(names.isEmpty());

        //ordenar os itens do array
        Collections.sort(names);

        for (String name : names){
            System.out.println(name);
        }



    }

}
