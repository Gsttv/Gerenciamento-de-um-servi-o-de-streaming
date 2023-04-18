package entites;

import entites.video.Video;

public class VaidadorClassificacao {

    public static void validador(Usuario usuario, Video video){
        if (usuario.getIdade() < video.getClassificacao()){
            System.out.println("Filme não é indicado para o usuario");
        }else {
             System.out.println("Filme permitido ao usuario");
        }
    }

}
