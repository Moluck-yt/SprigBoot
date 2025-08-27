import br.com.moluck.model.MinhasPreferidas;
import br.com.moluck.model.Musica;
import br.com.moluck.model.Podcast;

public static void main(String[] args) {
    Musica minhaMusica = new Musica();
    minhaMusica.setTitulo("Girassol");
    minhaMusica.setArtista("Ivyson");

    for (int i = 0; i < 1000; i++) {
        minhaMusica.reproduz();
    }
    for (int i = 0; i < 50; i++) {
       minhaMusica.curte();
    }

    Podcast meuPodcast = new Podcast();
    meuPodcast.setTitulo("Conhecendo o Tor Browser");
    meuPodcast.setApresentador("Mente Binaria");

    for (int i = 0; i < 5000; i++) {
        meuPodcast.reproduz();
    }

    for (int i = 0; i < 1000; i++) {
        meuPodcast.curte();
    }

    MinhasPreferidas preferidas = new MinhasPreferidas();
    preferidas.inclui(meuPodcast);
    preferidas.inclui(minhaMusica);

}