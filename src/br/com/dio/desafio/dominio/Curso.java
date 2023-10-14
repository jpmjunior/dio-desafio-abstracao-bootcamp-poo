package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHorarira;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCargaHorarira() {
        return cargaHorarira;
    }
    public void setCargaHorarira(int cargaHorarira) {
        this.cargaHorarira = cargaHorarira;
    }
    @Override
    public String toString() {
        return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", cargaHorarira=" + cargaHorarira + "]";
    }
}
