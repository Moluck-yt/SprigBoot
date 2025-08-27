import static java.lang.Math.min;

public class Carro {
    private String nome;
    private String modelo;
    private double[] precos = new double[3];

    private double media;

    public double precoMedio(double precoAno1, double precoAno2, double precoAno3) {
        precos[0] = precoAno1;
        precos[1] = precoAno2;
        precos[2] = precoAno3;
        return media = (precos[0] + precos[1] + precos[2]) / 3;
    }

    public double menorPreco(){
        return Math.min(precos[0], Math.min(precos[1], precos[2]));
    }

    public double maiorPreco(){
        return Math.max(precos[0], Math.max(precos[1], precos[2]));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public class ModeloCarro extends Carro{
        public ModeloCarro(String name, String modelo) {
            setNome(name);
            setModelo(modelo);
        }
    }

    public static void main(String[] args) {

        Carro.ModeloCarro carro = new Carro().new ModeloCarro("Ford", "Ka");

        carro.precoMedio(30000,32000,31000);

        System.out.println("Carro: " + carro.getNome() + " " + carro.getModelo() );
        System.out.println("Preço médio: " + carro.precoMedio(30000, 32000, 31000));
        System.out.println("Menor preço: " + carro.menorPreco());
        System.out.println("Maior preço: " + carro.maiorPreco());


    }
}
