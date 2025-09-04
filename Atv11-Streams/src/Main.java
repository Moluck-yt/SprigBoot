import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

//        1 - Dada a lista de números inteiros abaixo, filtre apenas os números pares e imprima-os.
                List<Integer> numero = Arrays.asList(1, 2, 3, 4, 5, 6);
                numero.stream()
                        .filter(n -> n % 2 ==0 )
                        .forEach(System.out::println);


//        2 - Dada a lista de strings abaixo, converta todas para letras maiúsculas e imprima-as.
                List<String> palavras = Arrays.asList("java", "stream", "lambda");
                palavras.stream()
                        .map(p -> p.toUpperCase())
                        .forEach(System.out::println);

//        3 - Dada a lista de números inteiros abaixo, filtre os números ímpares, multiplique cada um
//        por 2 e colete os resultados em uma nova lista.
                List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
                numeros.stream()
                        .filter(n -> n % 2 != 0)
                        .forEach(System.out::println);

//        4 - Dada a lista de strings abaixo, remova as duplicatas (palavras que aparecem mais de uma vez)
//        e imprima o resultado.
            List<String> palavra = Arrays.asList("apple", "banana", "apple", "orange", "banana");
            palavra.stream()
                    .distinct()
                    .forEach(System.out::println);

        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        listaDeNumeros.stream()
                .flatMap(l -> {
                    return l.stream()
                            .filter(n -> {
                                if (n <= 1) return false;
                                for (int i = 2; i <= Math.sqrt(n); i++) {
                                    if (n % i == 0) {
                                        return false;
                                    }
                                }
                                return true;
                            });
                }).forEach(System.out::println);
    }
}