package br.com.projetos.minhasMusicas.modelos;

public class Audio {
   private String titulo;
   private int totalDeReproducao;
   private int totalCurtidas;
   private int classificacao;

    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduz() {
        this.totalDeReproducao++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}