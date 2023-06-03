package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Curso;

public class Ejemplo5 {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Ruby", 30);
		Curso curso2 = new Curso("JavaScript", 10);
		Curso curso3 = new Curso("PHP", 20);
		Curso curso4 = new Curso("Java", 50);
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos);
		System.out.println("---------------------------");
		
//		Collections.sort(cursos);
//		System.out.println(cursos);
//		System.out.println("---------------------------");
		
//		Collections.sort(cursos, Collections.reverseOrder());
//		System.out.println(cursos);
//		System.out.println("---------------------------");
		
		cursos.sort(Comparator.comparing(Curso::getNombre)); // De esta forma no es necesario hacer el implement Comparable<Curso> de Curso.java
		System.out.println(cursos);
		System.out.println("---------------------------");
		
		List<Curso> cursoList = cursos.stream().sorted(Comparator.comparing(Curso::getTiempo)).collect(Collectors.toList());
		System.out.println(cursoList);
		System.out.println("---------------------------"); 
		
		List<Curso> cursoT = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparing(Curso::getTiempo)).collect(Collectors.toList());
		System.out.println(cursoT);
		System.out.println("---------------------------"); 
		
	}
}
