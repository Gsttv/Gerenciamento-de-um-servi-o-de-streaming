package entites;

import entites.video.Video;

import java.util.ArrayList;
import java.util.List;

public class SevicoStreaming {

    private  List<Usuario> listaUsuariosCadastrados = new ArrayList<Usuario>();
    private  List<Video> listaVideosDisponiveis = new ArrayList<Video>();
    private List<Acesso> listaAcessos =  new ArrayList<Acesso>();

    public  void adcionarDadosAcesso(Acesso dadosDoAcesso){
        listaAcessos.add(dadosDoAcesso);
    }
    public  List<Acesso> getListaAcessos(){
        return listaAcessos;
    }

    public  void adcionarVideoDisponivel(Video video){
        listaVideosDisponiveis.add(video);
    }
    public void getListaVideosDisponiveis(){
        System.out.println("--Filme e Series diponiveis--");
        for (Video v :listaVideosDisponiveis) {
            System.out.println("Titulo: " +v.getTitulo());
        }
    }
    public  void adcionarUsuarioCadrastado(Usuario usuario){
        listaUsuariosCadastrados.add(usuario);
    }

    public  List<Usuario> getListaUsuariosCadastrados(){
        return listaUsuariosCadastrados;
    }

}
