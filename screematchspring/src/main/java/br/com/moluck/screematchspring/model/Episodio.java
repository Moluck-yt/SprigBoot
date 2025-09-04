package br.com.moluck.screematchspring.model;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Episodio {
    private Integer temporada;
    private Integer numeroEpisodio;
    private String titulo;
    private Double avaliacao;
    private LocalDate dataLancamento;

    public Episodio(Integer numerotemporada, DadosEpisodio dadosEpisodio) {
        this.temporada = numerotemporada;
        this.numeroEpisodio = dadosEpisodio.numeroEpisodio();
        this.titulo = dadosEpisodio.titulo();

        try {
            this.avaliacao = Double.valueOf(dadosEpisodio.avaliacao());
        }catch (NumberFormatException e){
            this.avaliacao = 0.0;
        }

        try {
            this.dataLancamento = LocalDate.parse(dadosEpisodio.dataLancamento());
        }catch (DateTimeParseException e){
            this.dataLancamento = null;
        }
    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public Integer getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(Integer numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String toString(){
        return "Temporada= " + temporada +
                " NumeroEpisodio= " + numeroEpisodio +
                " Titulo= " + titulo +
                " Avaliacao= " + avaliacao +
                " DataLancamento= " + dataLancamento +
                "\n";
    }
}
