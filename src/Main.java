import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPriscila = new Dev();
        devPriscila.setNome("Augusto");
        devPriscila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila:" + devPriscila.getConteudosInscritos());
        devPriscila.progredir();
        devPriscila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila:" + devPriscila.getConteudosInscritos());
        System.out.println("Conteudos Conclu�dos Camila:" + devPriscila.getConteudosConcluidos());
        System.out.println("XP:" + devPriscila.calcularTotalXp());

        System.out.println("-------");

        Dev devDavi = new Dev();
        devDavi.setNome("Jessica");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Jessica:" + devDavi.getConteudosInscritos());
        devDavi.progredir();
        devDavi.progredir();
        devDavi.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joao:" + devDavi.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao:" + devDavi.getConteudosConcluidos());
        System.out.println("XP:" + devDavi.calcularTotalXp());

    }

}