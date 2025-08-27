import com.google.gson.Gson;



public class Pessoa {
    private String nome;
    private int idade;
    private String city;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Pessoa[" + "nome=" + nome + ", idade=" + idade + ", city=" + city + ']';
    }

    public static void main(String[] args) {

        Gson gson = new Gson();
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Maria");
        pessoa.setIdade(25);
        String json = gson.toJson(pessoa);
        System.out.println(json);
        Pessoa obj = gson.fromJson(json, Pessoa.class);
        System.out.println(obj);
    }
}
