public class Itens {
    private String nome;
    private double valor;
    public Itens(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }
    public String toString(){
        return "Nome: " + nome + " Valor: " + valor;
    }
}
