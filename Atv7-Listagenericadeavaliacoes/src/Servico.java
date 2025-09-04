public class Servico {
    private String nome;
    private String descricao;

    public Servico(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
       return "Nome: " + nome + "\nDescricao: " + descricao;
    }
}
