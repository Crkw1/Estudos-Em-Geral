package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java DIO");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(16);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript DIO");
        curso2.setDescricao("Descrição do curso JavaScript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());


        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWill = new Dev();
        devWill.setNome("William");
        devWill.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos William " + devWill.getConteudosInscritos());
        devWill.progredir();
        devWill.progredir();
        devWill.progredir();
        System.out.println("------------------------------------------------------");
        System.out.println("Conteúdos Inscritos William " + devWill.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos William " + devWill.getConteudosConcluidos());
        System.out.println("XP: " + devWill.calcularTotalXp());


        System.out.println("------------------------------------------------------");



        Dev devJose = new Dev();
        devJose.setNome("Jose Carlos");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jose " + devJose.getConteudosInscritos());
        devJose.progredir();
        devJose.progredir();
        System.out.println("------------------------------------------------------");
        System.out.println("Conteúdos Inscritos Jose " + devJose.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jose " + devJose.getConteudosConcluidos());
        System.out.println("XP: " + devJose.calcularTotalXp());


    }
}
