public class Main {
    public <T extends Comparable<T>> T maior(T a, T b){
        if(a.compareTo(b) == 0){
            System.out.println("Os tipos sao iguais");
        }else{
            System.out.println("Os tipos sao diferentes");
        }
        return null;
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.maior(1, 1);
    }
}
