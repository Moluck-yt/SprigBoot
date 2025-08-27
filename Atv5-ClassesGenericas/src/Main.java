import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var Produto1 = new Produto("Notebook", 10, "Notebook de 16GB");
        Avaliacao<Produto> avaliacao1 = new Avaliacao<>(Produto1, 7, "Muito bom");

        System.out.println(avaliacao1);
    }
}
