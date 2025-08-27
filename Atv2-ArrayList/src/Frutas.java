import java.util.ArrayList;

public class Frutas {
    private String Frutas;

    public String getFrutas() {
        return Frutas;
    }

    public void setFrutas(String frutas) {
        Frutas = frutas;
    }

    public static void main(String[] args) {
        var FrutasList = new ArrayList<>();
        FrutasList.add("Abacaxiu");
        FrutasList.add("Uva");
        FrutasList.add("Morango");
        FrutasList.add("Melancia");
        FrutasList.add("Banana");
        System.out.println(FrutasList.remove(1));
        System.out.println(FrutasList.size());
    }
}
