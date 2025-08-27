package br.com.moluck.sreenmatch.modelos;

import br.com.moluck.screenmacth.calculos.Classificavel;

public class Movie extends Titulo implements Classificavel {
    public String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }

    public Movie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }
}
