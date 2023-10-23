package br.com.projetos.minhasMusicas.modelos;

public class MinhasPreferidas {
    //metodo que vou analisar e incluir minha musica ou podcast preferido e vou ter uma mensagem de avaliação
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " É considerado sucesso absoluto" +
                    " e preferido por todos");
        } else {
            System.out.println(audio.getTitulo() + " É uma opção de incluir nos seus preferidos");
        }
    }

}
