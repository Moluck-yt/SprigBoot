import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

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
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }else{
            return this.nome.equals(((Pessoa) obj).nome);
        }
    }

    public static void main(String[] args) {

        var List = new ArrayList<Pessoa>();
        Pessoa pessoa1 = new Pessoa("Maria", 59);
        Pessoa pessoa2 = new Pessoa("Maria", 59);
        List.add(pessoa1);
        List.add(pessoa2);

        boolean saoIguais = (pessoa1 == pessoa2);
        System.out.println("pessoa1 == pessoa2: " + saoIguais); // Resultado: false

        System.out.println("pessoa1.equals(pessoa2): " + pessoa1.equals(pessoa2)); // Resultado: false (sem @Override de equals)

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        String nomeCompare = sc.nextLine();
        boolean encontrado = false;
        for (Pessoa pessoa : List) {
            if (nomeCompare.equals(pessoa.getNome())) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("O nome está na nossa lista");
        } else {
            System.out.println("O nome não está na nossa lista");
        }
    }
}