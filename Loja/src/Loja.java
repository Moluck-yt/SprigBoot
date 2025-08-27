import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Loja {
    private double credito;
    private String produto;
    private  double valor;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }



    public String toString(){
        return "Produto: " + produto + " Valor: " + valor;
    }

    public static void main(String[] args) {
        Loja loja = new Loja();
        System.out.println("Digite o valor do credito: ");
        Scanner entradas = new Scanner(System.in);
        double credito = entradas.nextDouble();
        loja.setCredito(credito);

        int continuar;

        Itens itens = new Itens(loja.getProduto(), loja.getValor());
        List<Itens> itensList = new ArrayList<>();
        itensList.add(itens);
        for (Itens itens1 : itensList){
            System.out.println(itens1);
        }
        do {
            System.out.println("Digite o produto: ");
            String produto = entradas.next();
            loja.setProduto(produto);

            System.out.println("Digite o valor do produto: ");
            double valor = entradas.nextDouble();
            loja.setValor(valor);
            if(loja.getCredito() < loja.getValor()){
                System.out.println("Saldo Insuficiente");
                break;
            }
            loja.setCredito(loja.getCredito() - valor);

            System.out.println("Se quiser continuar digite 1 se nao digite 0");
            continuar = entradas.nextInt();


        } while (continuar != 0);
        System.out.println(itensList);




    }
}
