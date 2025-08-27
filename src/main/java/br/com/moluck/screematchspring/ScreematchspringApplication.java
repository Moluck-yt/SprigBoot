package br.com.moluck.screematchspring;

import br.com.moluck.screematchspring.model.DadosSerie;
import br.com.moluck.screematchspring.service.ConsumoApi;
import br.com.moluck.screematchspring.service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreematchspringApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreematchspringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var consumoApi = new ConsumoApi();
        var json = consumoApi.obterDados("https://www.omdbapi.com/?t=teen+wolf&apikey=63f0221e");
        System.out.println(json);
        var converso = new ConverterDados();
        DadosSerie dados = converso.obterDados(json, DadosSerie.class);
        System.out.println(dados);
    }

}
