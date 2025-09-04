package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErrorDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TitulosOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o nome do filme: ");
            String nome = scanner.nextLine();

            String URL = "https://www.omdbapi.com/?t=" + nome.replace(" ", "+") + "&apikey=63f0221e";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(URL))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            TitulosOMDB meuTituloom = gson.fromJson(response.body(), TitulosOMDB.class);
            System.out.println(meuTituloom);

//        try{
            Titulo meuTitulo = new Titulo(meuTituloom);
            System.out.println(meuTitulo);
            FileWriter fileWriter = new FileWriter("meuTitulo.json");
            fileWriter.write(meuTitulo.toString());
            fileWriter.close();
        } catch (NumberFormatException e){
            System.out.println("Aconteceu um erro");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e ){
            System.out.println("Argumento invalido");
            System.out.println(e.getMessage());
        }catch (ErrorDeConversaoDeAnoException e){
            System.out.println(e.getMensagem());
        }
        System.out.println("Deu certo");
    }
}
