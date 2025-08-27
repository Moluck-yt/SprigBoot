package br.com.moluck.model;

public class Audio {
    private String titulo;
    private int totalReproducao;
    private int totalCurtidads;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getTotalCurtidads() {
        return totalCurtidads;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.totalCurtidads++;
    }

    public void reproduz(){
        this.totalReproducao++;
    }
}
