package entites.video;

import java.util.Date;

public class Filme extends Video{
    public Filme(String titulo, String diretor, String elenco, String genero, String sinopse, Date anoDeLancamento, Integer classificacao) {
        super(titulo, diretor, elenco, genero, sinopse, anoDeLancamento, classificacao);
    }

}
