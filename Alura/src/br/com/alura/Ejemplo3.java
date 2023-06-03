package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;

public class Ejemplo3 {
	public static void main(String[] args) {
		String curso1 = "Geometria";
		String curso2 = "Fisica";
		String curso3 = "Quimica";
		String curso4 = "Historia";
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println(cursos);
		System.out.println("---------------------------");
		
		Collections.sort(cursos);
		System.out.println(cursos);
		System.out.println("---------------------------");
		
		Collections.sort(cursos, Collections.reverseOrder());
		System.out.println(cursos);
		System.out.println("---------------------------");
		
		cursos.sort(Comparator.naturalOrder());
		System.out.println(cursos);
		System.out.println("---------------------------");
		
		List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList());
		System.out.println(cursosList);
		System.out.println("---------------------------");
		
	}
}
