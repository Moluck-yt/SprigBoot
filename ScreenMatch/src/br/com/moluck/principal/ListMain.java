package br.com.moluck.principal;

import br.com.moluck.sreenmatch.modelos.Movie;
import br.com.moluck.sreenmatch.modelos.Serie;
import br.com.moluck.sreenmatch.modelos.Titulo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ListMain {
    public static void main(String[] args) {
        Movie filme2 = new Movie("O Castelo Encantado", 2018);
        filme2.avalia(9);
        Movie meuFilme = new Movie("Superman", 2024);
        Serie lost = new Serie("Lost", 2018);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(filme2);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item);

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Superman");
        buscaPorArtista.add("Moluck");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenacao \n"+ buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
