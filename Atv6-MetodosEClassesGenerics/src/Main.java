public class Main {
    public static void main(String[] args) {
        Caixa<Integer> caixa = new Caixa<>(10);
        System.out.println(caixa.conteudo);

        Caixa<String> caixa1 = new Caixa<>("Teste");
        System.out.println(caixa1.conteudo);
    }
}
