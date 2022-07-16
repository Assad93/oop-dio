package br.com.bootcamp;

import java.time.LocalDate;

import br.com.bootcamp.dominio.Bootcamp;
import br.com.bootcamp.dominio.Curso;
import br.com.bootcamp.dominio.Dev;
import br.com.bootcamp.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Curso curso = new Curso();
	   curso.setTitulo("Spring");
	   curso.setDescricao("Java web");
	   curso.setCargaHoraria(40);
		
	   Curso curso1 = new Curso();
	   curso.setTitulo("SQL");
	   curso.setDescricao("BD");
	   curso.setCargaHoraria(40);
		
	   Mentoria mentoria = new Mentoria();
	   mentoria.setTitulo("Ola");
	   mentoria.setDescricao("Boaaa");
	   mentoria.setData(LocalDate.now());
	  
	  Bootcamp bootcamp = new Bootcamp();
	  bootcamp.setNome("Java web");
	  bootcamp.setDescricao("Aprendendo Java Web");
	  bootcamp.getConteudos().add(mentoria);
	  bootcamp.getConteudos().add(curso);
	  bootcamp.getConteudos().add(curso1);
	  
	  Dev jp = new Dev();
	  jp.setNome("Jp");
	  jp.inscreverBootcamp(bootcamp);
	  
	  Dev samir = new Dev();
	  samir.setNome("samir");
	  samir.inscreverBootcamp(bootcamp);
	  samir.progredir();
	  
       System.out.print("XP: " + samir.totalXp());
	}

}
