import java.util.ArrayList;
import java.util.List;

public class Repositorio<T> {
    private List<T> lista = new ArrayList<>();
    private String nome;
    private String comentario;

    public Repositorio(T tipo ,String nome, String comentario) {
        this.nome = nome;
        this.comentario = comentario;
    }

    public String toString() {
        return  "\nNome: " + nome + "\nComentario: " + comentario;
    }

}
