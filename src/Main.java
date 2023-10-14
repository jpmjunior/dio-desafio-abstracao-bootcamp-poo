import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Developer;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Criando Curso 1...");
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHorarira(8);

        System.out.println("Criando Curso 2...");
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHorarira(4);

        System.out.println("Criando Mentoria...");
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do Curso Java");
        mentoria.setDescricao("Descrição da Mentoria do Curso Java");
        mentoria.setData(LocalDate.now());
        
        System.out.println("Criando Bootcamp...");
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp de Java");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("Criando Developer João...");
        Developer devJoao = new Developer();
        devJoao.setNome("João");
        
        System.out.println("Criando Developer Maria...");
        Developer devMaria = new Developer();
        devJoao.setNome("Maria");

        System.out.println("Conteúdos inscritos Joao:");
        System.out.println(devJoao.getConteudosInscritos());
        System.out.println("Conteúdos inscritos Maria:");
        System.out.println(devMaria.getConteudosInscritos());

        System.out.println("Realizando a inscrição dos Devs no Bootcamp...");
        devJoao.inscreverBootcamp(bootcamp);
        devMaria.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos Joao:");
        System.out.println(devJoao.getConteudosInscritos());
        System.out.println("Conteúdos inscritos Maria:");
        System.out.println(devMaria.getConteudosInscritos());
        
        System.out.println("XP de Joao: " + devJoao.calcularTotalXp());
        System.out.println("XP de Maria: " + devMaria.calcularTotalXp());
        
        System.out.println("Progredindo no Bootcamp...");
        devJoao.progredir();
        devMaria.progredir();
        
        System.out.println("Conteúdos inscritos Joao:");
        System.out.println(devJoao.getConteudosInscritos());
        System.out.println("Conteúdos inscritos Maria:");
        System.out.println(devMaria.getConteudosInscritos());
                
        System.out.println("Conteúdos concluídos Joao:");
        System.out.println(devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos concluídos Maria:");
        System.out.println(devMaria.getConteudosConcluidos());
        
        System.out.println("XP de Joao: " + devJoao.calcularTotalXp());
        System.out.println("XP de Maria: " + devMaria.calcularTotalXp());
    
        System.out.println("Progredindo novamente no Bootcamp...");
        devJoao.progredir();
        devMaria.progredir();
        
        System.out.println("Conteúdos inscritos Joao:");
        System.out.println(devJoao.getConteudosInscritos());
        System.out.println("Conteúdos inscritos Maria:");
        System.out.println(devMaria.getConteudosInscritos());
                
        System.out.println("Conteúdos concluídos Joao:");
        System.out.println(devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos concluídos Maria:");
        System.out.println(devMaria.getConteudosConcluidos());
        
        System.out.println("XP de Joao: " + devJoao.calcularTotalXp());
        System.out.println("XP de Maria: " + devMaria.calcularTotalXp());

    }
}
