public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(int idade, String nome) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(10, "Marta");
        System.out.println(pessoa);
    }
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + '}';
    }
}
