package br.com.moluck.principal;

import br.com.moluck.screenmacth.calculos.CalculaduraDeTempo;
import br.com.moluck.screenmacth.calculos.Recomendacao;
import br.com.moluck.sreenmatch.modelos.Movie;
import br.com.moluck.sreenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Serie lost = new Serie("Lost", 2018);
        lost.setTemporadas(10);
        lost.setDuracaoEmMinutos(50);
        System.out.println("Duracao para maratonar lost: " + lost.getDuracaoEmMinutos());

        Movie meuFilme = new Movie("Superman", 2024);
        meuFilme.setDuracaoEmMinutos(200);
        Movie filme2 = new Movie("O Castelo Encantado", 2018);
        filme2.setDuracaoEmMinutos(150);


        CalculaduraDeTempo calc = new CalculaduraDeTempo();
        calc.inclui(meuFilme);
        calc.inclui(filme2);
        System.out.println(calc.getTempoTotal());


        Recomendacao filtro = new Recomendacao();
        filtro.filtra(meuFilme);

        ArrayList<Movie> listaDeMovies = new ArrayList<>();
        listaDeMovies.add(meuFilme);
        listaDeMovies.add(filme2);
        System.out.println("Tamanho da lista " + listaDeMovies.size());
        System.out.println("Primeiro filme " + listaDeMovies.get(0).getNome());
        System.out.println(listaDeMovies);
        System.out.println("toString do filme " + listaDeMovies.get(0).toString());


    }
}
