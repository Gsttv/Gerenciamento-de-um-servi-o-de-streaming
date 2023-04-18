package entites.video;

import java.util.Date;

public abstract class Video {
    private String titulo;
    private String diretor;
    private String elenco;
    private String genero;
    private String sinopse;
    private Date anoDeLancamento;
    private Integer classificacao;

    public Video(String titulo, String diretor, String elenco, String genero, String sinopse, Date anoDeLancamento, Integer classificacao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.elenco = elenco;
        this.genero = genero;
        this.sinopse = sinopse;
        this.anoDeLancamento = anoDeLancamento;
        this.classificacao = classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Date getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(Date anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public Integer getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Integer classificacao) {
        this.classificacao = classificacao;
    }
}
