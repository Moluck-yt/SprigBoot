import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa " + "(nome: " + nome + ", idade: " + idade + ")";
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        p1.setNome("Joao");
        p2.setNome("Maria");
        p3.setNome("Jonas");

        p1.setIdade(69);
        p2.setIdade(76);
        p3.setIdade(17);

        var listaDePessoas = new ArrayList<>();
        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);
        System.out.println(listaDePessoas);
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
    }
}
