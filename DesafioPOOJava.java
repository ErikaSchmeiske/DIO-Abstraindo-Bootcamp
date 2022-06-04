/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiopoojava;

import java.time.LocalDate;

/**
 *
 * @author Erika-Engest
 */
public class DesafioPOOJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(0);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso java-2");
        curso2.setDescricao("descrição curso java-2");
        curso2.setCargaHoraria(0);
        
        Mentoria mentoria = new Mentoria();
        
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição da mentoria");
        mentoria.setData(LocalDate.now());
        
        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }*/
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp. setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devErika = new Dev();
        devErika.setNome("Erika");
        devErika.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Dev Erika" + devErika.getConteudosInscricao());
        
        devErika.progredir();
        
        System.out.println("Conteúdos Concluídos Dev Erika" + devErika.getConteudosConcluidos());
        System.out.println("XP: "+ devErika.calcularTotalXP());
        
        System.out.println("----------------------");
        
        Dev devAidan = new Dev();
        devAidan.setNome("Aidan");
        devAidan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Dev Aidan" + devAidan.getConteudosInscricao());
        
        devAidan.progredir();
        
        System.out.println("Conteúdos Concluídos Dev Aidan" + devAidan.getConteudosConcluidos());
        System.out.println("XP: "+ devAidan.calcularTotalXP());
        
    
}
}
