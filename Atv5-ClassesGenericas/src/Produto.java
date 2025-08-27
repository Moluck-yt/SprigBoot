public class Produto {
    private String nome;
    private int quantidade;
    private String descricao;

    public Produto(String nome, int quantidade, String descricao) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", quantidade=" + quantidade + ", descricao=" + descricao + '}';
    }
}
