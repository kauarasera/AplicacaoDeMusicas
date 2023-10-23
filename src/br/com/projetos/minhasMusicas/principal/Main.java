package br.com.projetos.minhasMusicas.principal;

import br.com.projetos.minhasMusicas.modelos.MinhasPreferidas;
import br.com.projetos.minhasMusicas.modelos.Musica;
import br.com.projetos.minhasMusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        //similando musica através de um for, não é boa pratica, feito isso pra só testar
        Musica musica = new Musica();
        musica.setTitulo("Somebody Told Me");
        musica.setArtista("The Killers");

        for (int i = 0; i < 100; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("BolhaDev");
        podcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 1500; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(podcast);
        minhasPreferidas.inclui(musica);
    }
}