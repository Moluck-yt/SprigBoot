public class lambdas {

    public static void main(String[] args) {

        multiplicacao multiplicacao = (int a, int b) -> a * b;
        System.out.println(multiplicacao.multi(2, 3));

        NumberPrimo numberPrimo = n -> {
            if (n <= 1) return false;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }

            return true;
        };

        System.out.println(numberPrimo.isPrimo(10));

        lowCase diminuirtexto = s -> s.toLowerCase();
        System.out.println(diminuirtexto.lowerCase("TESTE"));
    }
}

