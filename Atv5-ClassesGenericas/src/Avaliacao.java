public class Avaliacao<T> {
    private T item;
    private int nota;
    private String comentario;

   public Avaliacao(T item, int nota, String comentario){
       this.item = item;
       this.nota = nota;
       this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Avaliacao{" + "item=" + item + ", nota=" + nota + ", comentario=" + comentario + '}';
    }
}
