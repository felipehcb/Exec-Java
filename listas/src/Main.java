

//+++ LISTA +++
//
//* Tamanho da lista: size()

//* Inserir elemento na lista: add(obj), add(int, obj)

//* Remover elementos da lista> remove(obj), remove(int), removeIf(Predicate)

//* Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)

//* Filtrar lista com base em predicado:
//    List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());

//* Econtrar primeira ocorrência com base em predicado:
//    Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");


        System.out.println(list.size());

        //list.remove("Anna");

        for (String x : list){
            System.out.println(x);
        }
        System.out.println("--------------------------");

        //list.remove(1);

        list.removeIf(x -> x.charAt(0) == 'M'); // predicado

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("--------------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("--------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result){
            System.out.println(x);
        }

        System.out.println("--------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);


    }
}