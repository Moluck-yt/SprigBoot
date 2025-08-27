import java.util.ArrayList;
import java.util.Scanner;

public class ProdArray {

    private static String nome;
    private int quantidade;
    private double preco;

    public ProdArray(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public static String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString(){
        return "("+ "nome: " + nome + ", quantidade: " + quantidade + ", preco: " + preco + ")";
    }

    public static void main(String[] args) {

        var prodarray = new ArrayList<ProdArray>();
        Scanner input = new Scanner(System.in);
        prodarray.add(new ProdArray("Rexona",5.50, 10 ));
        prodarray.add(new ProdArray("Relogio",150.00, 2 ));
        prodarray.add(new ProdArray("Lampada",12.90, 5 ));
        System.out.println("Tamanho: " + prodarray.size());

        System.out.println("Insira o pedido que vc deseja de 1 a 3: ");
        int number = input.nextInt();
        System.out.println(prodarray.get(number - 1 ));
        System.out.println(prodarray);



    }



}
