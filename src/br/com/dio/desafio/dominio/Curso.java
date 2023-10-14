package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHorarira;
    
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHorarira;
    }
    
    public int getCargaHorarira() {
        return cargaHorarira;
    }
    public void setCargaHorarira(int cargaHorarira) {
        this.cargaHorarira = cargaHorarira;
    }
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHorarira=" + cargaHorarira + "]";
    }
}
