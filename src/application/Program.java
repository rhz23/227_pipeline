package application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(3,4,5,10,7);

        Stream<Integer> st1 = lista.stream().map(x -> x * 10); //operação intermediária
        System.out.println(Arrays.toString(st1.toArray())); //operação terminal

        int sum = lista.stream().reduce(0, (x,y) -> x + y);
        System.out.println("Sum = " + sum);

        List<Integer> newList = lista.stream()
                .filter(x -> x%2 == 0) //filtra, pegando todos os números que a divisão por 2 resulta em 0 sobra (pares)
                .map(x -> x * 10) //pega todos os elementos da stream e multiplica por 10
                .collect(Collectors.toList());//operação terminal que transforma a stream em uma lista
        System.out.println(Arrays.toString(newList.toArray()));

    }
}
