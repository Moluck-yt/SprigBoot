package br.com.moluck.screematchspring;

import br.com.moluck.screematchspring.Main.Principal;
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
        Principal main = new Principal();
        main.exibeMenu();

   }

}
