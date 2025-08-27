public class ProdPerecivel extends ProdArray{
    private String ano;

    public ProdPerecivel(String nome, double preco,int quantidade, String ano){
        super(nome,preco,quantidade);
        this.ano = ano;

    }

    public String getAno() {
        return ano;
    }

    public static void main(String[] args) {
        var Perecivel = new ProdPerecivel("Lata de Monster", 9.10, 12,"20-11-2004");
        System.out.println(Perecivel);
    }
}
