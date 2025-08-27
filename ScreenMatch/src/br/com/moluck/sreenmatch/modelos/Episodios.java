package br.com.moluck.sreenmatch.modelos;

import br.com.moluck.screenmacth.calculos.Classificavel;

public class Episodios implements Classificavel {
    private int nummero;
    private String nome;
    private Serie serie;
    private int totalVisu;

    public int getTotalVisu() {
        return totalVisu;
    }

    public void setTotalVisu(int totalVisu) {
        this.totalVisu = totalVisu;
    }

    public int getNummero() {
        return nummero;
    }

    public void setNummero(int nummero) {
        this.nummero = nummero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisu > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
