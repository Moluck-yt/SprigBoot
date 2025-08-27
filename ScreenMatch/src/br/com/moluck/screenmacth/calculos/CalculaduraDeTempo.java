package br.com.moluck.screenmacth.calculos;
import br.com.moluck.sreenmatch.modelos.Movie;
import br.com.moluck.sreenmatch.modelos.Titulo;

public class CalculaduraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Movie f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
