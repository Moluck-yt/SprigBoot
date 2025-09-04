public class Main {

    public <T> T eco(T valor){
        return valor;
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.eco(34.2));
    }
}
