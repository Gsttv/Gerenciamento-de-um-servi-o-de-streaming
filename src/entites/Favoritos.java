package entites;

import entites.video.Video;

import java.util.ArrayList;
import java.util.List;

public class Favoritos {

    List<Video> filmesFavoritos = new ArrayList<Video>();

    public void adcionarFilmeAosFavoritos(Video video){
        filmesFavoritos.add(video);
    }
    public List<Video> getFilmesFavoritos(){
        return filmesFavoritos;
    }
}
