package App;

import entites.SevicoStreaming;
import entites.VaidadorClassificacao;
import entites.video.Filme;
import entites.video.Video;

import java.util.Date;

public class app {
    public static void main(String[] args) {

        Video filme =  new Filme("a","a","a","a","a",new Date(),12);
        Video filme2 =  new Filme("b","a","a","a","a",new Date(),12);
        SevicoStreaming lista = new SevicoStreaming();
        lista.adcionarVideoDisponivel(filme);
        lista.adcionarVideoDisponivel(filme2);
        lista.getListaVideosDisponiveis();
    }
}
