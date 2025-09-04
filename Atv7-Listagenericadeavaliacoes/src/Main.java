public class Main {

    public static void main(String[] args) {
        Produto produto = new Produto("Celular", "Celular Samsung Galaxy S20 Ultra");
        Repositorio<Produto> repositorio = new Repositorio<>(produto, "Celular Samsung Galaxy S20 Ultra", "Otimo celular");
        System.out.println(repositorio + "\n");


        Servico servico = new Servico("Servente", "Ajudar a bater massa");
        Repositorio<Servico> servicoRepositorio = new Repositorio<>(servico, "Servente", "E baom demias");
        System.out.println(servicoRepositorio);
    }
}
