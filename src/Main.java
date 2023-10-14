import java.time.LocalDate;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHorarira(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHorarira(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do Curso Java");
        mentoria.setDescricao("Descrição da Mentoria do Curso Java");
        mentoria.setData(LocalDate.now());
        
        Conteudo conteudo1 = curso1;
        Conteudo conteudo2 = curso2;
        Conteudo conteudo3 = mentoria;
        
        System.out.println(conteudo1);
        System.out.println(conteudo2);
        System.out.println(conteudo3);
    }
}
