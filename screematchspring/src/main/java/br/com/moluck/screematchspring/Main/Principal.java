package br.com.moluck.screematchspring.Main;

import br.com.moluck.screematchspring.model.DadosEpisodio;
import br.com.moluck.screematchspring.model.DadosSerie;
import br.com.moluck.screematchspring.model.DadosTemporada;
import br.com.moluck.screematchspring.model.Episodio;
import br.com.moluck.screematchspring.service.ConsumoApi;
import br.com.moluck.screematchspring.service.ConverterDados;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {

    private Scanner leitor = new Scanner(System.in);

    private ConsumoApi consumoApi = new ConsumoApi();

    private ConverterDados converso = new ConverterDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=63f0221e";

    public void exibeMenu(){
        System.out.println("""
                ============================Bem vindo ao Screematch====================
                                        
                                            Digite o nome da serie:
                """);

        var nomeserie = leitor.nextLine();
        var json = consumoApi.obterDados(ENDERECO + nomeserie.replace(" ", "+") + API_KEY);

        DadosSerie dados = converso.obterDados(json, DadosSerie.class);
        System.out.println(dados);
        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i <= dados.totalTemporadas(); i++){
            json = consumoApi.obterDados(ENDERECO + nomeserie.replace(" ", "+") + "&season=" + i + API_KEY);
            DadosTemporada dadosTemporada = converso.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }

       // temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));
        List<DadosEpisodio> dadosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .toList();

//        System.out.println("\n Top 5 episodios mais avaliados: \n");
//        dadosEpisodios.stream()
//                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
//                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
//                .limit(5)
//                .forEach(System.out::println);

        List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream()
                        .map(d -> new Episodio(t.numero(), d)))
                .collect(Collectors.toList());

        System.out.println("A parti de que ano vc deseja ver os episodios?");
        var ano = leitor.nextInt();
        leitor.nextLine();

        LocalDate dataBusca = LocalDate.of(ano, 1, 1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        episodios.stream()
                .filter(e -> e.getDataLancamento() != null && e.getDataLancamento().isAfter(dataBusca))
                .forEach(e -> System.out.println(
                        "Temporada: " + e.getTemporada() +
                                " Episodio: " + e.getTitulo() +
                                " Data Lancamento " + e.getDataLancamento().format(dtf)
                ));
    }
}
